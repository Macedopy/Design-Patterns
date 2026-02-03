package design.pattern.chain_of_responsability;

public class ManagerBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget)
    {
        if(budget.getTotal() <= 5000) 
        {
            System.out.println("Manager treated the sell");
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }
}
