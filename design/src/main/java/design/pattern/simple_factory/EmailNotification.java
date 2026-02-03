package design.pattern.simple_factory;

public class EmailNotification implements NotificationType {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + " with message: " + message);
    }

}
