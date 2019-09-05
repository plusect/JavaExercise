package plusect.javaexercise.designpattern.createmode.factory;

import plusect.javaexercise.designpattern.createmode.simplefactory.Food;

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
