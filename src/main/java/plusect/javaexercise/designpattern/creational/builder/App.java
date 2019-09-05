package plusect.javaexercise.designpattern.creational.builder;

public class App {
    public static void main(String[] args) {
        User a = User.builder()
                .username("abc")
                .age(18)
                .password("123").build();
    }
}
