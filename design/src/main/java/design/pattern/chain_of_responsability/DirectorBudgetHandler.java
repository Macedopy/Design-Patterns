package design.pattern.chain_of_responsability;

public class DirectorBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget)
    {
        if (budget.getTotal() < 50000)
        {
            System.out.println("Director treated the sell");
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }

}
