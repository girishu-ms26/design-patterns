package design.patterns.structural.decorator;

public class CarDecorator extends BasicCar {
    private final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assembleCar() {
        this.car.assembleCar();
    }
}
