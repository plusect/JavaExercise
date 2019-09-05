package plusect.javaexercise.designpattern.createmode.factory;


import plusect.javaexercise.designpattern.createmode.simplefactory.Food;

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
