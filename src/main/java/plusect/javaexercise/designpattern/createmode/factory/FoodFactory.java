package plusect.javaexercise.designpattern.createmode.factory;

import plusect.javaexercise.designpattern.createmode.simplefactory.Food;

/**
 * 工厂模式
 * 核心在于，我们需要在第一步选好我们需要的工厂。
 * 比如我们有LogFactory接口，实现类有FileLogFactory和KafkaLogFactory，
 * 分别对应将日志写入文件和写入Kafka中，
 * 我们客户端第一步就需要决定到底要实例化FileLogFactory还是KafkaLogFactory这将决定之后的所有的操作。
 */
public interface FoodFactory {
    Food makeFood(String name);
}
