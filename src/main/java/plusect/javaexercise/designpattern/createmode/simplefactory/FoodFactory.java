package plusect.javaexercise.designpattern.createmode.simplefactory;

/**
 * 简单工厂模式
 * 简单工厂模式通常就是一个工厂类 XxxFactory，里面有一个静态方法，
 * 根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象。
 * 强调职责单一原则，一个类只提供一种功能，FoodFactory 的功能就是只要负责生产各种 Food
 * @author plusect
 */
public class FoodFactory {

    public static Food makeFood(String name){
        if ("noodle".equals(name)){
            return new NoodleFood();
        }else if ("kaoya".equals(name)){
            return new KaoYaFood();
        }else {
            return null;
        }
    }
}
