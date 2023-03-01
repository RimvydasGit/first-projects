package Uzd1;

public class PoliceCar implements IsEmergency, IsLandVehicle {
	String name = "Police car";
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
	this.name = name;
		
	}
	int a = 4;
	@Override
	public int getMaxPassengers() {
		return a;
	}

	@Override
	public void setMaxPassengers(int Passengers) {
		a = Passengers;
		
	}
	int b  = 120;
	@Override
	public int getMaxSpeed() {
		
		return b;
	}

	@Override
	public void setMaxSpeed(int vmaxSpeed) {
		b = vmaxSpeed;
		
	}

	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return c;
	}
	int c = 4;
	@Override
	public void setNumWheels(int a) {
		c = a;
		
	}

	@Override
	public void drive() {
		System.out.println("Police is driving");
		
	}

	@Override
	public void soundSiren() {
		System.out.println("Police is driving! Siren on !!!");
		
	}

}
