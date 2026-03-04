package design.pattern.factory;

public class BicycleFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }

}
