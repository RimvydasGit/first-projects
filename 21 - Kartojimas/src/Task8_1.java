

public class Task8_1 {

	public int stringNum(String firstword, String secondWord) throws InvalidOperation {

		char[] first = firstword.toCharArray();
		char[] second = secondWord.toCharArray();
		String firstNum = stringOfNumber(first);
		String secondNum = stringOfNumber(second);
		try {
			if ((firstNum == "") && (secondNum == "")) {
				throw new InvalidOperation("Invalid Operation");
			}
		} catch (InvalidOperation e) {
			System.out.println(e.getMessage());
			System.exit(666);
		}
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);

		return num1 + num2;
	}

	private String stringOfNumber(char[] a) {
		String numSum = "";
		for (int i = 0; i < a.length; i++) {
			try {
				numSum = numSum + Integer.parseInt("" + a[i]);
			} catch (NumberFormatException e) {
			}
		}
		return numSum;
	}

}
