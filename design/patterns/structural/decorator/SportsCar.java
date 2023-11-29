package design.patterns.structural.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assembleCar(){
        System.out.println("Sports Car assembled");
    }
}
