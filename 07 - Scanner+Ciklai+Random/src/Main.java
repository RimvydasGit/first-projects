import java.util.Random;
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
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Iveskite savo varda:");
//		String vardas = sc.next();
//		System.out.println("Jusu vardas yra: " + vardas);
//		System.out.println("Iveskite savo metus:");
//		int metai = sc.nextInt();
//		//System.out.println("Jums: " + metai);
//		
//		Random rnd = new Random();
//        int atsitiktinis = rnd.nextInt(10);
//        System.out.println("Jusu laimingas skaicius: " + atsitiktinis);
		////////////////////////
		//Sukurti žaidimą.
		//Programa sugeneruoja skaičių nuo 0 iki 100.
		//Paprašo žaidėjo spėti skaičių.
		//Vartotojas įveda skaičių.
		//Programa patikrina ar vartotojo įvestas skaičius yra didesnis, ar mažesnis, ar vartotojas atspėjo.
		//Atitinkamai parašo:
		//"Skaičius yra mažesnis. Spėkite dar kartą".
		//"Skaičius yra didesnis. Spėkite dar kartą".
		//"Atspėjote. Sveikinimai."
		//Kai žaidėjas atspėja, programa baigia darbą.
		//
		//Hints:
		//Naudoti while ciklą, Random ir Scanner klases.
		///////////////////////
//		Random rnd = new Random();
//		
//		int atsitiktinis = rnd.nextInt(100);
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Random: " + atsitiktinis);
//
//		System.out.println("Spek savo magiska skaiciu: ");
//
//		int skaicius = sc.nextInt();
//
//		int spejimai = 1;
//
//		if (skaicius == atsitiktinis) {
//			System.out.println("Skaicius " + skaicius + " yra lygus magiskam skaiciui: " + atsitiktinis
//					+ ". Sveikinu atspejote is pirmo karto.");
//		}
//		while (skaicius < atsitiktinis) {
//			System.out.println("Skaicius " + skaicius + " yra mazesnis, spekite dar karta: ");
//			skaicius = sc.nextInt();
//			spejimai = spejimai + 1;
//			if (skaicius == atsitiktinis) {
//				System.out.println("Skaicius " + skaicius + " yra lygus magiskam skaiciui: " + atsitiktinis
//						+ ". Sveikinu atspejote is: " + spejimai + " spejimu!");
//			}
//
//			while (skaicius > atsitiktinis) {
//				System.out.println("Skaicius " + skaicius + " yra didesnis, spekite dar karta: ");
//				skaicius = sc.nextInt();
//				spejimai = spejimai + 1;
//				if (skaicius == atsitiktinis) {
//					System.out.println("Skaicius " + skaicius + " yra lygus magiskam skaiciui: " + atsitiktinis
//							+ ". Sveikinu atspejote is: " + spejimai + " spejimu!");
//				}
//			}
//		}
		int zetonai = 100;
		int metsk = 0;
		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Jus turite: " + zetonai + ",ar testi?");
			
		String sprendimas = sc.next();
		
		//if (zetonai > 0) sprendimas.equals("T"); {/// Žaidimas vyksta automatiškai tol, kol žaidėjas turi žetonų. Skaičiuoti metimų skaičių. Ijungti.
		
		if (!(sprendimas.equals("T"))) System.out.println("Jus nusprendete baigti zaidima. Turite: " + zetonai + " zetonus!");
		
			while (sprendimas.equals("T") &&  (zetonai > 0))  {
					if (zetonai == 1) System.out.println("Jums liko paskutinis sukimas");
				int dice1 = (rnd.nextInt(6) + 1);
				int dice2 = (rnd.nextInt(6) + 1);
				metsk++;
				zetonai = zetonai - 1;
				System.out.println("Pirmas kauliukas: " + dice1 + ", Antras kauliukas: " + dice2);
					if ((dice1 ==  6) && (dice2 == 6)) zetonai = zetonai + 30;
						if (zetonai == 0) {
							System.out.println("Jums baigesi zetonai");}
					else {
					System.out.println("Jus turite: " + zetonai + ",ar testi?");
					sprendimas = sc.next();/// Isjungti jei automatinis zaidimas
						if (!(sprendimas.equals("T"))) System.out.println("Jus nusprendete baigti zaidima. Turite: " + zetonai + " zetonus!");
						}
					
			}
		//}/// Žaidimas vyksta automatiškai tol, kol žaidėjas turi žetonų. Skaičiuoti metimų skaičių.Ijungti;
		System.out.println("Jus atlikote: " + metsk + " metimu.");	
		////////////////////////////////
		//	Sav diena = Sav.ANTRADIENIS;
					///////////
	}

}

