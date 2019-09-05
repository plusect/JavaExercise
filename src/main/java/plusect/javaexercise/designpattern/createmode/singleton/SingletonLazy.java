package plusect.javaexercise.designpattern.createmode.singleton;

/**
 * 懒汉模式
 */
public class SingletonLazy {

    // 首先，也是先堵死 new SingletonNest() 这条路
    private SingletonLazy() {
    }

    // 添加volatile是因为singleton = new SingletonNest()并非是一个原子操作，可能会有指令重排
    private static volatile SingletonLazy instance = null;

    public SingletonLazy getInstance() {
        //第一次判断提升效率，只有instance为null时再进入
        if (instance == null){
            synchronized (SingletonLazy.class){
                // 第二次判断防止出现多个实例
                if (instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
