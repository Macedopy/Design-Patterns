package design.pattern.abstract_factory.vehicle;

import design.pattern.abstract_factory.Customer;
import design.pattern.abstract_factory.VehicleProtocol;

public class EnterpriseCar implements VehicleProtocol {
    private String name;
    private final Customer customer;

    public EnterpriseCar(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    @Override
    public void pickUp() {
        System.out.println("Enterprise Car is picking up " + name + " for customer " + customer.getName());
    }

    
}
