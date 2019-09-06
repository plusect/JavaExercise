package plusect.javaexercise.designpattern.structural.proxy;

import plusect.javaexercise.designpattern.creational.simplefactory.Food;

/**
 * 代理要表现得“就像是”真实实现类，所以需要实现 FoodService
 * @author plusect
 */
public class FoodServiceProxy implements FoodService {

    // 内部一定要有一个真实的实现类，当然也可以通过构造方法注入
    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeKaoYa() {
        System.out.println("开始做烤鸭！");

        // 如果我们定义这句为核心代码的话，那么，核心代码是真实实现类做的，
        // 代理只是在核心代码前后做些“无足轻重”的事情
        Food food = foodService.makeKaoYa();

        System.out.println("烤鸭做完了，加点胡椒粉"); //增强
        food.setCondiment("pepper");

        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("开始做面条");
        final Food food = foodService.makeNoodle();
        System.out.println("面条做完了");
        return food;
    }
}
