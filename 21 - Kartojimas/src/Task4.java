import java.util.Scanner;

public class Task4 {

	Scanner sc = new Scanner(System.in);

	public String mixLetters() {
		String firstWord = getRealTextFromConsole("Type first word: ");
		String secondWord = getRealTextFromConsole("Type second word: ");
		String finalWord = "";
		String firstLetter = "";
		String secondLetter = "";
		while (true) {
			if (!firstWord.isEmpty())
				firstLetter = "" + firstWord.charAt(0);
			if (!secondWord.isEmpty())
				secondLetter = "" + secondWord.charAt(0);
			finalWord = finalWord + firstLetter + secondLetter;
			firstLetter = "";
			secondLetter = "";
			if (!firstWord.isEmpty())
				firstWord = firstWord.substring(1);
			if (!secondWord.isEmpty())
				secondWord = secondWord.substring(1);
			if (firstWord.isEmpty() && secondWord.isEmpty())
				break;
		}
		System.out.println("Mixed word is : " + finalWord);
		return finalWord;
	}

	private String getRealTextFromConsole(String pranesimas) {
		while (true) {
			System.out.println(pranesimas);
			String text = sc.nextLine();
			text = text.trim();
			if (!text.isBlank()) {
				return text;
			}
		}
	}

}
