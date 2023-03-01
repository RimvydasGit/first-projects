package Uzd1;

public class Frigate implements IsSeaVessel{
	public void fireGun() {
		System.out.println("Frigate starts shooting!");
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
	String hovercraft = "Frigate";
	@Override
	public String getName() {
		
		return hovercraft;
	}
	@Override
	public void setName(String name) {
		hovercraft = name;
		
	}
	int passenger = 10;
	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return passenger;
	}
	@Override
	public void setMaxPassengers(int Passengers) {
		passenger = Passengers;
		
	}
	int maxSpeed = 30;
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
