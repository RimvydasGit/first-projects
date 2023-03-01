package uzd2;

public class Studentas extends Asmuo{
	public Studentas() {
		vardas = "Studentas";
		pavarde = "Studentauskas";
	}
	
	
		@Override
	 void spausdinkInformacija() {
		System.out.println(vardas +" "+ pavarde);
	}
}
