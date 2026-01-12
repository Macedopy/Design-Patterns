package design.pattern.facade.service;

import design.pattern.facade.InventoryManager;
import design.pattern.facade.Notifier;
import design.pattern.facade.PaymentProcessor;
import design.pattern.facade.ShippingService;

public class OrderServiceFacade {
    private final InventoryManager inventoryManager;
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;
    private final Notifier notifier;
    public OrderServiceFacade(InventoryManager inventoryManager,
                              PaymentProcessor paymentProcessor,
                              ShippingService shippingService,
                              Notifier notifier) {
        this.inventoryManager = inventoryManager;
        this.paymentProcessor = paymentProcessor;
        this.shippingService = shippingService;
        this.notifier = notifier;
    }

    public boolean placeOrder() {
        inventoryManager.updateStock();
        paymentProcessor.processPayment();
        shippingService.initiateShipping();
        notifier.sendNotification();

        return true;
    }

}
