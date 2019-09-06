package plusect.javaexercise.designpattern.structural.proxy;

public class App {
    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeKaoYa();
    }
}
