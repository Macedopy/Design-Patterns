package design.pattern.factory;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}