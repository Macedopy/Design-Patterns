package design.pattern.chain_of_responsability;

public class CeoBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget)
    {
        System.out.println("Budget approved by CEO.");
        budget.setApproved(true);
        return budget;
    }

}
