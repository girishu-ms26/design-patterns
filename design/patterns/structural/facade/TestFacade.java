package design.patterns.structural.facade;

public class TestFacade {
    public static void main(String[]args) {
        HotelStaff hotelStaff = new HotelStaff();
        hotelStaff.showVegMenu();
        hotelStaff.showNonVegMenu();
        hotelStaff.showVegAndNonVegMenu();
    }
}
