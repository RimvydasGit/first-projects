package Uzd1;

public class Hovercraft implements IsLandVehicle, IsSeaVessel {
	public void enterLand(){
		System.out.println("Hover craft on Land. ");
	}
	public void enterSea(){
		System.out.println("Hover craft on Sea. ");
	}
	int wheels = 1;
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
	int disp = 1;
	@Override
	public int getDisplacement() {
		return disp;
	}

	@Override
	public void setDisplacement(int b) {
		b = disp;	
	}
	@Override
	public void launch() {
		System.out.println("Swimmin in the...");
	}
	String hovercraft = "Hovercraft";
	@Override
	public String getName() {
		
		return hovercraft;
	}
	@Override
	public void setName(String name) {
		hovercraft = name;
		
	}
	int passenger = 5;
	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return passenger;
	}
	@Override
	public void setMaxPassengers(int Passengers) {
		passenger = Passengers;
		
	}
	int maxSpeed = 50;
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
