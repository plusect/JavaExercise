package plusect.javaexercise.designpattern.createmode.abstractfactory;

public class Computer {
    private CPU cpu;
    private MainBoard mainBoard;

    public Computer(CPU cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
    }
}
