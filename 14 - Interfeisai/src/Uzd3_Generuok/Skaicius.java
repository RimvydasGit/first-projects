package Uzd3_Generuok;

import java.util.Random;

public abstract class Skaicius {
	Random rnd = new Random();
	int a = rnd.nextInt(20, 200);
	protected int[] masyvas = new int[a];

	public abstract void generuok();

	public int suma() {
		int sum = 0;
		for (int i = 0; i < masyvas.length; i++) {
			sum = sum + masyvas[i];
		}
		return sum;
	}
}
