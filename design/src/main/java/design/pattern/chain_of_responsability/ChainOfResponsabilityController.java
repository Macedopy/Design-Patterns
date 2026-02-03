package design.pattern.chain_of_responsability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChainOfResponsabilityController {
    
    @PostMapping
    public CustomerBudget processBudget(Object request) 
    {
        CustomerBudget customerBudget = new CustomerBudget(false ,10);

        SellerBudgetHandler sellerHandler = new SellerBudgetHandler();
        sellerHandler.setNextHandler(new ManagerBudgetHandler())
                    .setNextHandler(new DirectorBudgetHandler())
                    .setNextHandler(new CeoBudgetHandler());

    }

}
