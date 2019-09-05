package plusect.javaexercise.designpattern.createmode.singleton;

import java.util.Date;

/**
 * 饿汉模式
 * @author plusect
 */
public class SingletonEHan {

    // 首先，将 new SingletonEHan() 堵死
    private SingletonEHan() {
    }

    // 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
    private static SingletonEHan instance = new SingletonEHan();

    public static SingletonEHan getInstance() {
        return instance;
    }

    // 瞎写一个静态方法。这里想说的是，如果我们只是要调用 SingletonEHan.getDate(...)，
    // 本来是不想要生成 SingletonEHan 实例的，不过没办法，已经生成了
    public static Date getDate(String mode){
        return new Date();
    }
}
