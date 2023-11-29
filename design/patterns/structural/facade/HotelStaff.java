package design.patterns.structural.facade;

public class HotelStaff {
    private static NonVegMenu nonVegMenu;
    private static  VegMenu vegMenu;

    public HotelStaff() {
        nonVegMenu = new NonVegMenu();
        vegMenu = new VegMenu();
    }
    public void showVegMenu() {
        vegMenu.showMenu();
    }

    public void showNonVegMenu() {
        nonVegMenu.showMenu();
    }

    public void showVegAndNonVegMenu() {
        vegMenu.showMenu();
        nonVegMenu.showMenu();
    }
}
