package Uzd1;

public class Jeep implements IsLandVehicle {
	int wheels = 0;

	public void soundHorn() {
		System.out.println("Jeep sounds horn!!!");
	}

	@Override
	public int getNumWheels() {
		return wheels;

	}

	@Override
	public void setNumWheels(int a) {
		wheels = a;

	}

	@Override
	public void drive() {
		System.out.println("On a road trip!");

	}

	String hovercraft = "Jeep";

	@Override
	public String getName() {

		return hovercraft;
	}

	@Override
	public void setName(String name) {
		hovercraft = name;

	}

	int passenger = 4;

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return passenger;
	}

	@Override
	public void setMaxPassengers(int Passengers) {
		passenger = Passengers;

	}

	int maxSpeed = 80;

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(int MaxSpeed) {
		maxSpeed = MaxSpeed;

	}

}
