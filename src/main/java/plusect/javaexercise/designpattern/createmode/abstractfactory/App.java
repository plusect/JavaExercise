package plusect.javaexercise.designpattern.createmode.abstractfactory;

public class App {
    public static void main(String[] args) {
        //第一步选定厂商
        ComputerFactory computerFactory = new AmdComputerFactory();
        //从这个厂商造cpu
        final CPU cpu = computerFactory.makeCPU();
        //从这个厂商造主板
        final MainBoard mainBoard = computerFactory.makeMainBoard();

        //组装电脑
        Computer computer = new Computer(cpu, mainBoard);
    }
}
