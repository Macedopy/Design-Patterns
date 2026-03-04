package design.pattern.abstract_factory.vehicle;

import design.pattern.abstract_factory.Customer;
import design.pattern.abstract_factory.VehicleProtocol;

public class IndividualCar implements VehicleProtocol {
    private String name;
    private final Customer customer;

    public IndividualCar(String name, Customer customer)
    {
        this.name = name;
        this.customer = customer;
    }

    @Override
    public void pickUp() {
        System.out.println("Individual Car is picking up " + name + " for customer " + customer.getName());
    }
    
}
