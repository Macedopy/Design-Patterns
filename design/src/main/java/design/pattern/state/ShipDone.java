package design.pattern.state;

public class ShipDone implements OrderState {

    @Override
    public void prepare(Order order) throws Exception {
        throw new Exception("Order is already completed");
    }

    @Override
    public void ship(Order order) throws Exception {
        throw new Exception("Order is already completed");
    }

    @Override
    public void deliver(Order order) throws Exception {
        throw new Exception("Order is already completed");
    }

}
