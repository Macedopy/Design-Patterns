package design.pattern.chain_of_responsability;

public class SellerBudgetHandler extends BaseBudgetHandler {
    @Override
    public CustomerBudget handle(CustomerBudget budget)
    {
        if(budget.getTotal() <= 1000) 
        {
            System.out.println("Seller treated the sell");
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }

}
