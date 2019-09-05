package plusect.javaexercise.designpattern.creational.abstractfactory;

/**
 * 当涉及到产品族的时候，就需要引入抽象工厂模式了。
 * 如果Intel家产的CPU和AMD产的主板不能兼容使用，那么这代码就容易出错，
 * 因为客户端并不知道它们不兼容，也就会错误地出现随意组合。
 * 我们不再定义CPU工厂、主板工厂、硬盘工厂、显示屏工厂等等，我们直接定义电脑工厂，
 * 每个电脑工厂负责生产所有的设备，这样能保证肯定不存在兼容问题。
 * 产品族的概念，它代表了组成某个产品的一系列附件的集合。
 * @author plusect
 */
public interface ComputerFactory {
    CPU makeCPU();
    MainBoard makeMainBoard();
}
