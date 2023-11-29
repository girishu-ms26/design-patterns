package design.patterns.structural.decorator;

public class BasicCar implements Car{
    @Override
    public void assembleCar() {
        System.out.println("completed assembling basic car");
    }
}
