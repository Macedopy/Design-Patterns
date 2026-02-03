package design.pattern.chain_of_responsability;

public abstract class BaseBudgetHandler {
    protected BaseBudgetHandler nextHandler;

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler handler)
    {
        this.nextHandler = handler;
        return handler;
    }

    public CustomerBudget handle(CustomerBudget budget)
    {
        if (this.nextHandler != null) return this.nextHandler.handle(budget);
        return budget;
    }
}
