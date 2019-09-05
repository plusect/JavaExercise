package plusect.javaexercise.designpattern.createmode.factory;

public class App {
    public static void main(String[] args) {
        //先选择一个工厂
        FoodFactory foodFactory = new ChineseFoodFactory();
        //不同的工厂同一个参数造出不同的对象
        foodFactory.makeFood("A");
    }
}
