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
    public void deliver(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deliver'");
    }

}
