
public class Uzd1 {
	public static void main(String[] args) {
		int a = 2;
		int b = 7;
		float rez = 0F;
		float liekana = 0F;
		System.out.println("Pradine reiksme a=" + a + "  b=" + b);
		a++;
		b--;
		System.out.println("Vidurine reiksme a=" + a + "  b=" + b);
		rez = a * b /5F;
		liekana = b % a;
		System.out.println("a * b /5F = " + rez);
		float c = 3.6F * 5;
		System.out.println("Mid check 3.6 * 5 = " + c);
		System.out.println("Liekana 6/3 = " + liekana);
	} 
}
