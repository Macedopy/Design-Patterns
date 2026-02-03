package design.pattern.strategy.services;

import design.pattern.strategy.contracts.TaxTypeInterface;

public class TaxCalculator {
    private TaxTypeInterface taxType;

    public double calculate(double amount) {
        return taxType.calculateTax(amount);
    }

    
}
