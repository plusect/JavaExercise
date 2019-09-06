package plusect.javaexercise.designpattern.structural.objectadapter;

public class App {
    public static void main(String[] args) {
        //有一个野鸡
        Cock cock = new WildCock();
        //将野鸡适配成鸭
        Duck duck = new CockAdpater(cock);

        duck.quack();
    }
}
