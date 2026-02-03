package design.pattern.state;

public class OrderMade implements OrderState {

    @Override
    public void prepare(Order order) {
        order.setState(new Initiated());
    }

    @Override
    public void ship(Order order) throws Exception {
        throw new Exception("Order is not prepared yet");
    }

    @Override
    public void deliver(Order order) throws Exception {
        throw new Exception("Order is not prepared yet");
        }

}
