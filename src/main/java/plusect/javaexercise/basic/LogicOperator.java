package plusect.javaexercise.basic;

/**
 * 逻辑运算符，与、或、异或
 * &&拥有短路功能
 * @author plusect
 */
public class LogicOperator {
    public static void main(String[] args) {
        System.out.println("=====与====");
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println(true & true);
        System.out.println("=====或====");
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println(true | true);
        System.out.println("=====异或====");
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
    }
}
