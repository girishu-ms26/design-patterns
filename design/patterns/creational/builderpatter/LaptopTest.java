package design.patterns.creational.builderpatter;

public class LaptopTest {
    public static void main(String[]args) {
        Laptop laptop = new Laptop.LaptopBuilder("Acer","Predator",16,500)
                .setGraphicsCardEnabled(true)
                .setWebcam(true)
                .build();
        System.out.println();
    }
}
