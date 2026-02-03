package design.pattern.simple_factory;

public class SmsNotification implements NotificationType {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }

}
