package design.patterns.creational.builderpatter;

public class ComputerTester {
    public static void main(String[]args) {
        Computer computer = new Computer.ComputerBuilder("500","16")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(true).build();
        System.out.println("DOne");
    }
}
