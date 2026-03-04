package design.pattern.abstract_factory.customer.factories;

import design.pattern.abstract_factory.Customer;
import design.pattern.abstract_factory.customer.IndividualCustomer;
import design.pattern.abstract_factory.vehicle.IndividualCar;
import design.pattern.factory.Vehicle;

public class IndividualCustomerVehicleFactory {
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer = this.createCustomer(customerName);
        return (Vehicle) new IndividualCar(vehicleName, customer);
    }
}
