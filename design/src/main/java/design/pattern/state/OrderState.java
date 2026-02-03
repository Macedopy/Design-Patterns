package design.pattern.state;

public interface OrderState {
    public void prepare(Order order) throws Exception;
    public void ship(Order order) throws Exception;
    public void deliver(Order order)throws Exception;
}
