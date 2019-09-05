package plusect.javaexercise.designpattern.createmode.abstractfactory;

public class AmdComputerFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }
}
