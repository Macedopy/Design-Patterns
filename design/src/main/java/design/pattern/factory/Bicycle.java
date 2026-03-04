package design.pattern.factory;

public class Bicycle implements Vehicle {
    private String name;

    public Bicycle(String name)
    {
        this.name = name;
    }

	@Override
	public void pickUp(String customerName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'pickUp'");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'stop'");
	}
}
