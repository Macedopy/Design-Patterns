package design.pattern.strategy.services;

import design.pattern.strategy.contracts.TaxTypeInterface;

public class ISS implements TaxTypeInterface {

    @Override
    public double calculateTax(double amount) {
        return (amount * 11) / 100; 
    }
}
