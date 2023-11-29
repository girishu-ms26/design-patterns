package design.patterns.creational.factorypattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
