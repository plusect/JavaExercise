package plusect.javaexercise.designpattern.creational.singleton;

/**
 * 枚举类单例
 * 在类加载的时候会初始化里面的所有的实例，
 * 而且 JVM 保证了它们不会再被实例化，所以它天生就是单例的
 *
 */
public enum SingleInstance {
    INSTANCE;

    //使用SingleInstance.INSTANCE.fun1()
    public void fun1() {
        // do something
    }
}
