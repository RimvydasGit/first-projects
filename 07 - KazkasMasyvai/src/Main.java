import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int[] masyvas = {7, 8, 5, 6, 9, 11};
//		int suma = 0;
//		int i = 0;
//		
//		for (i = 0; i < masyvas.length; i++) {
//			suma += masyvas[i];
//		}
//		//for (int e : masyvas) {
//		//	suma += e;}
//	
//		System.out.println(suma);
//		boolean salyga = true;
//		
//		while (salyga) {
//			salyga = false;
//		}
//		while (i < masyvas.length) {
//			i++;
//		}
//		/////
//		do {
//		
//		}while (i < masyvas.length);
		///
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite savo varda:");
		String vardas = sc.next();
		System.out.println("Jusu vardas yra: " + vardas);
		System.out.println("Iveskite savo metus:");
		int metai = sc.nextInt();
		System.out.println("Jums: " + metai);
	}

}
