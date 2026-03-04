package design.pattern.abstract_factory.customer.factories;

import design.pattern.abstract_factory.Customer;
import design.pattern.abstract_factory.customer.EnterpriseCustomer;
import design.pattern.abstract_factory.vehicle.EnterpriseCar;
import design.pattern.factory.Vehicle;

public class EnterpriseCustomerVehicleFactory {
    Customer createCustomer(String customerName) 
    {
        return new EnterpriseCustomer(customerName);
    }
    Vehicle createVehicle(String vehicleName, String customerName) 
    {
        Customer customer = createCustomer(customerName);
        return (Vehicle) new EnterpriseCar(vehicleName, customer);
    }
}