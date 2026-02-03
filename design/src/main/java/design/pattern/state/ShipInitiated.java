package design.pattern.state;

public class ShipInitiated implements OrderState {

    @Override
    public void prepare(Order order) throws Exception {
        throw new Exception("Order is already ordered");
    }

    @Override
    public void ship(Order order) throws Exception {
        throw new Exception("Order is already shipped");
    }

    @Override
    public void deliver(Order order) {
        order.setState(new ShipDone());
    }

}
