package design.pattern.state;

public class Initiated implements OrderState {

    @Override
    public void prepare(Order order) throws Exception {
        throw new Exception("Order is already initiated");
    }

    @Override
    public void ship(Order order) {
        order.setState(new ShipInitiated());
    }

    @Override
    public void deliver(Order order) throws Exception {
        throw new Exception("Order cannot be delivered, is not shipped yet");
    }

}
