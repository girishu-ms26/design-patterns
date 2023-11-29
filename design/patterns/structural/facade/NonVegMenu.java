package design.patterns.structural.facade;

public class NonVegMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Chicken Biriyani");
        System.out.println("Mutton Biriyani");
        System.out.println("Fish Biriyani");
    }
}
