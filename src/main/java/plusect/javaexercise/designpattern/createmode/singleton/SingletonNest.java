package plusect.javaexercise.designpattern.createmode.singleton;

/**
 * 嵌套类的懒汉模式
 *
 * 对于内部类Holder，它是一个饿汉式的单例实现，
 * 在Holder初始化的时候会由ClassLoader来保证同步，使INSTANCE是一个真单例。
 * 同时，由于Holder是一个内部类，只在外部类的Singleton的getInstance()中被使用，
 * 所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
 *
 * 它利用了ClassLoader来保证了同步，同时又能让开发者控制类加载的时机。
 * 从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现.
 *
 * @author plusect
 */
public class SingletonNest {
    private SingletonNest() {
    }

    // 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
    private static class Holder{
        private static SingletonNest instance = new SingletonNest();
    }

    public SingletonNest getInstance(){
        return Holder.instance;
    }
}
