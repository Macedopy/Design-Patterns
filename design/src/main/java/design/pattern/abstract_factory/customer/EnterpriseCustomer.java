package design.pattern.abstract_factory.customer;

import design.pattern.abstract_factory.Customer;

public class EnterpriseCustomer extends Customer {
    private String name;

    public EnterpriseCustomer(String name) {
        super(name);
        this.name = name;
    }


}
