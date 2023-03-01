package Uzd3_Generuok;

public class TeigiamasSkaicius extends Skaicius {

	@Override
	public void generuok() {
		for (int i = 0; i < masyvas.length; i++) {
			a = rnd.nextInt();
			if (a == 0) a = a++;
			if (a > 0)masyvas[i] = a;
			else masyvas[i] = (a * (-1));
			
			System.out.println(masyvas[i]);
		}
		System.out.println("Ilgis: "+ masyvas.length);
	}

}
