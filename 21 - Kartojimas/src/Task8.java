import java.util.Scanner;

public class Task8 {
	Scanner sc = new Scanner(System.in);

	public int kiekskaiciu() {
		int number = getNumberFromConsole("Iveskite skaiciu");
		int counter = 1;
		//System.out.println((int) Math.ceil(Math.log10(Math.abs(number))));
		if (number < 0) number = -number;
		while (true) {
			if (number > 9) {
				number = Math.round(number / 10);
			 
				counter++;
			}
			if (number <= 9)return counter;
		}
	}

	private int getNumberFromConsole(String statement) {
		while (true) {
			try {
				System.out.println(statement);
				String text = sc.nextLine();
				int result = Integer.parseInt(text);
				return result;
			} catch (Exception e) {
			}
		}
	}
}
