package plusect.javaexercise.designpattern.createmode.abstractfactory;

public class IntelComputerFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }
}
