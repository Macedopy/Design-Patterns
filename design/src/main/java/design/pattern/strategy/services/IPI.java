package design.pattern.strategy.services;

import design.pattern.strategy.contracts.TaxTypeInterface;

public class IPI implements TaxTypeInterface {

    @Override
    public double calculateTax(double amount) {
        return (amount * 15) / 100; 
    }
}
