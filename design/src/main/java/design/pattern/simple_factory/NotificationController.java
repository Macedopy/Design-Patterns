package design.pattern.simple_factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    NotificationFactory notificationFactory;

    @PostMapping("/send/{notificationType}")
    public void sendNotification(@PathVariable String notificationType) {
        notificationFactory.create(notificationType);
    }
}
