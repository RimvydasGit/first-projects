import java.util.Scanner;

public class Task1 {
	Scanner sc = new Scanner(System.in);

	public void pirminiaiSkaiciai() {
		int firstNumber = userIntImput("Type in first number");
		int secondNumber = 0;
		while (true) {
			secondNumber = userIntImput("Type in second number");
			if (secondNumber <= 1) {
				System.out.println("Number has to be more than 1");
			} else
				break;
		}

		System.out.println("Prime numbers in interval: ");
		while (firstNumber <= 1) {
			firstNumber++;
		}
		while (firstNumber <= secondNumber) {
			if (isPrime(firstNumber)) {
				System.out.println(firstNumber + " ");
				firstNumber++;
			} else
				firstNumber++;

		}
	}

	private int userIntImput(String statement) {
		while (true) {
			try {
				System.out.println(statement);
				String imput = sc.nextLine();
				return Integer.parseInt(imput);
			} catch (Exception e) {

			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
