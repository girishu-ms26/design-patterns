package design.patterns.structural.decorator;

public class CarTest {
    public static void main(String[]args) {
        Car basicCar = new BasicCar();
        Car sportsCar = new SportsCar(new CarDecorator(basicCar));
        sportsCar.assembleCar();
    }
}
