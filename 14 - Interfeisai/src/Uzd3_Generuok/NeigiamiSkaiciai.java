package Uzd3_Generuok;

public class NeigiamiSkaiciai extends Skaicius {

	@Override
	public void generuok() {
		for (int i = 0; i < masyvas.length; i++) {
			a = rnd.nextInt();
			if (a == 0) a = a++;
			if (a > 0)masyvas[i] = (a * (-1));
			else masyvas[i] =a ;
			
			System.out.println(masyvas[i]);
		}
		System.out.println("Ilgis: "+ masyvas.length);
	}


}
