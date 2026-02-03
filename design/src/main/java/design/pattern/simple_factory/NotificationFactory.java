package design.pattern.simple_factory;

public class NotificationFactory {
    public NotificationType create(String notificationType) {
        if(notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if(notificationType.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if(notificationType.equalsIgnoreCase("SLACK")) {
            return new SlackNotification();
        }

        throw new IllegalArgumentException("Unknown notification type: " + notificationType);
    }
}
