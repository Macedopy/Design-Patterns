package design.pattern.abstract_factory.customer.factories;

import design.pattern.abstract_factory.Customer;
import design.pattern.factory.Vehicle;

public interface CreateCustomerVehicleFactory {
    Customer createCustomer(String customerName);
    Vehicle createVehicle(String vehicleName, String customerName);
}
