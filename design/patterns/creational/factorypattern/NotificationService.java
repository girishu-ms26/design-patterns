package design.patterns.creational.factorypattern;

public class NotificationService {
    public static void main(String[]args) throws Exception {
        NotificationFactory notification = new NotificationFactory();
        Notification notification1 = notification.createNotification("SMS");
        notification1.notifyUser();
        Notification notification2 = notification.createNotification("EMAIL");
        notification2.notifyUser();
        Notification notification3 = notification.createNotification("MOBILE");
        notification3.notifyUser();
    }
}
