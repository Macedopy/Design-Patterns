package design.pattern.factory;

public class Car implements Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println("Car is picking up " + customerName);
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

}
