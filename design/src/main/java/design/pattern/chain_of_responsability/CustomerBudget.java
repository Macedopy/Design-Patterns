package design.pattern.chain_of_responsability;

import lombok.Data;

@Data
public class CustomerBudget {
    private boolean approved = false;
    private double total;

    public CustomerBudget(boolean approved, double total) {
        this.approved = approved;
        this.total = total;
    }
}
