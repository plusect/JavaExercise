package plusect.javaexercise.designpattern.creational.factory;


import plusect.javaexercise.designpattern.creational.simplefactory.Food;

public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)){
            return new ChineseFoodA();
        }else if ("B".equals(name)){
            return new ChineseFoodB();
        }else {
            return null;
        }
    }
}
