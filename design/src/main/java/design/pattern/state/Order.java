package design.pattern.state;

public class Order{
    private OrderState state;

    public Order()
    {
        this.state = new OrderMade();
    }

    public void setState(OrderState state)
    {
        this.state = state;
    }

    public void prepare() throws Exception
    {
        state.prepare(this);
    }

    public void ship() throws Exception
    {
        state.ship(this);
    }

    public void deliver() throws Exception
    {
        state.deliver(this);
    }
}
