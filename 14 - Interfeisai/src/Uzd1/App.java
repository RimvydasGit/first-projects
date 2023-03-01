package Uzd1;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
	
	Jeep obj1 = new Jeep();
	IsVehicle obj2 = new Frigate();
	IsLandVehicle obj3 = new Hovercraft();
	IsLandVehicle obj4 = new PoliceCar();
	
	ArrayList<IsVehicle> list = new ArrayList<>();
	list.add(obj1);
	list.add(obj2);
	list.add(obj3);
	list.add(obj4);
	list.add(obj4);
	
	for (IsVehicle e : list) {
		if (e instanceof Jeep) {
			Jeep jeep = (Jeep)e;
			jeep.soundHorn();
			
			}
		if (e instanceof Hovercraft) {
			IsSeaVessel frigate = (IsSeaVessel)e;
			frigate.launch();
			
		}
		if (e instanceof PoliceCar) {
			PoliceCar policecar = (PoliceCar)e;
			policecar.drive();
			policecar.soundSiren();
			
		}

	}
	
}
}