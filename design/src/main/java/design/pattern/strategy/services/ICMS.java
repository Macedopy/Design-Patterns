package design.pattern.strategy.services;

import design.pattern.strategy.contracts.TaxTypeInterface;

public class ICMS implements TaxTypeInterface {

    @Override
    public double calculateTax(double amount) {
        return (amount * 4) / 100; 
    }
}
