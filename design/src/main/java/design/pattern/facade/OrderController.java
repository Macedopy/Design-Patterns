package design.pattern.facade;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.RestController;

import design.pattern.facade.service.OrderServiceFacade;
import jakarta.security.auth.message.callback.SecretKeyCallback.Request;

@RestController
public class OrderController {
    private final OrderServiceFacade orderServiceFacade;
    public OrderController(OrderServiceFacade orderServiceFacade) {
        this.orderServiceFacade = orderServiceFacade;
    }

    public Response newOrder(Request request) {

        return orderServiceFacade.placeOrder(request);
    }
}
