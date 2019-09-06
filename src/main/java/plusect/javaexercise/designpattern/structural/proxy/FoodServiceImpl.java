package plusect.javaexercise.designpattern.structural.proxy;

import plusect.javaexercise.designpattern.creational.simplefactory.Food;
import plusect.javaexercise.designpattern.creational.simplefactory.KaoYaFood;
import plusect.javaexercise.designpattern.creational.simplefactory.NoodleFood;

public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeKaoYa() {
        KaoYaFood kaoYaFood = new KaoYaFood();
        kaoYaFood.setDuck("1kg");
        kaoYaFood.setSpicy("1g");
        kaoYaFood.setSalt("3g");
        return kaoYaFood;
    }

    @Override
    public Food makeNoodle() {
        NoodleFood noodleFood = new NoodleFood();
        noodleFood.setNoodle("500g");
        noodleFood.setSalt("5g");
        return noodleFood;
    }
}
