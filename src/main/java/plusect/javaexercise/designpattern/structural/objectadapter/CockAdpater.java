package plusect.javaexercise.designpattern.structural.objectadapter;

/**
 * 将鸡适配成鸭，这样鸡也能当鸭来用
 * 毫无疑问，首先，这个适配器肯定需要 implements Duck，这样才能当做鸭来用
 */
public class CockAdpater implements Duck {
    Cock cock;

    // 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
    public CockAdpater(Cock cock) {
        this.cock = cock;
    }

    // 实现鸭的呱呱叫方法
    @Override
    public void quack() {
        // 内部其实是一只鸡的咕咕叫
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
