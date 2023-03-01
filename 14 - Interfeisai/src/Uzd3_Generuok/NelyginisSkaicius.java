package Uzd3_Generuok;

public class NelyginisSkaicius extends Skaicius{

	@Override
	public void generuok() {
		for (int i = 0; i < masyvas.length; i++) {
			int a = 2;
			while ((a % 2 == 0) && (a != 0)) {
			a = rnd.nextInt();
			masyvas[i] = a;
			}
			System.out.println(masyvas[i]);
			}
			
		System.out.println("Ilgis: "+ masyvas.length);	
		}
		
	

}
