package plusect.javaexercise.designpattern.structural.classadapter;

public class App {
    public static void main(String[] args) {
        Target target = new SomeAdapter();
    }
}
