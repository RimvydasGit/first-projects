import java.util.Scanner;

public class Test {
	public static void arZaisti() {
        Scanner sc = new Scanner(System.in);
        String zaisti = sc.nextLine();
        while (true) {
            if (zaisti.equalsIgnoreCase("Taip")) {
                System.out.println("\nPuiku! Galime pradeti.\n");
                break;
            } else if (zaisti.equalsIgnoreCase("Ne")) {
                System.err.println("Iki pasimatymo kita karta!");
                System.exit(0);
            } else {
                System.out.println("Ar norite zaisti: TAIP/NE");
                zaisti = sc.nextLine();
            }
        }
    }
}
