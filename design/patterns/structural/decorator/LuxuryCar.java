package design.patterns.structural.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Luxury Car Assembled");
    }
}
