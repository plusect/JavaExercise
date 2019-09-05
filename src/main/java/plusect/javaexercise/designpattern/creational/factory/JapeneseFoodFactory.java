package plusect.javaexercise.designpattern.creational.factory;

import plusect.javaexercise.designpattern.creational.simplefactory.Food;

public class JapeneseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)){
            return new JapeneseFoodA();
        }else if("B".equals(name)){
            return new JapeneseFoodB();
        }else {
            return null;
        }
    }
}
