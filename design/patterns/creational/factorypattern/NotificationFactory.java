package design.patterns.creational.factorypattern;

public class NotificationFactory {
    public Notification createNotification(String channel) throws Exception {
        switch (channel) {
            case "SMS" :
                return new SMSNotification();
            case "EMAIL" :
                return new EmailNotification();
            default:
                throw new Exception("No such channel");
        }
    }
}
