import java.util.ArrayList;

public class Task3 {

	public void ArmstrongNumbers() {
		int initialNumber = 100;
		int lastNumber = 999;
		ArrayList<Integer> args = new ArrayList<>();
		System.out.println("Three digit Armstrong numbers is: ");
		while (initialNumber <= lastNumber) {
			args.add(initialNumber);
			initialNumber++;
		}
		for (Integer e : args) {
			int FirstDigit = getFirstDigit(e);
			int SecondDigit = getSecondDigit(e);
			int ThirdDigit = getThirdDigit(e);
			int sum = FirstDigit * FirstDigit * FirstDigit + SecondDigit * SecondDigit * SecondDigit
					+ ThirdDigit * ThirdDigit * ThirdDigit;
			if (e.equals(sum)) {
				System.out.println(e);
			}
		}

	}

	public int getFirstDigit(int initialNumber) {
		String numToString = Integer.toString(initialNumber);
		numToString = numToString.substring(0, 1);
		return Integer.parseInt(numToString);
	}

	public int getSecondDigit(int initialNumber) {
		String numToString = Integer.toString(initialNumber);
		numToString = numToString.substring(1, 2);
		return Integer.parseInt(numToString);
	}

	public int getThirdDigit(int initialNumber) {
		String numToString = Integer.toString(initialNumber);
		numToString = numToString.substring(2, 3);
		return Integer.parseInt(numToString);
	}


	public void fibbonacci(int till) {
		int startNum = 0;
		int startNum2 = 1;
		ArrayList<Integer> fib = new ArrayList<>();
		fib.add(startNum);
;
		while (fib.get(fib.size() - 1) <= till) {
			if (fib.size()> 1) fib.add(startNum);
			fib.add(startNum2);
			startNum = startNum + startNum2;
			startNum2 = startNum + startNum2;
		}
		fib.remove(fib.size() - 1);
		for (Integer e : fib) {
		System.out.println(e);
		}
	}
}
