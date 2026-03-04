package design.pattern.abstract_factory.customer;

import design.pattern.abstract_factory.Customer;

public class IndividualCustomer extends Customer {
    private String name;

    public IndividualCustomer(String name) {
        super(name);
        this.name = name;
    }
}
