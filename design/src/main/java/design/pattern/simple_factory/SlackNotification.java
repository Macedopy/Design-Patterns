package design.pattern.simple_factory;

public class SlackNotification implements NotificationType {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending Slack message to " + recipient + " with message: " + message);
    }

}
