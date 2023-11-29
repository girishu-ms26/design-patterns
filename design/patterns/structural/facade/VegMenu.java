package design.patterns.structural.facade;

public class VegMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Idly");
        System.out.println("VADA");
        System.out.println("Sambar");
    }
}
