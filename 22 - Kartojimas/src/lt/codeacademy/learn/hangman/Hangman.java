package lt.codeacademy.learn.hangman;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
	FileHelper fh = new FileHelper();
	ArrayList<String> wordList = new ArrayList<>();
	HangmanPainter hangmanPainter = new HangmanPainter();

	public void run() {
		wordList = fh.load();
		char[] wordFromListInLetters = selectRandomWordFromList(wordList).toCharArray();
		String guessedWord = guesedEmptyWordGenerator(wordFromListInLetters);
		String guessedWrongLetters = "";
		int guessAttemptsLeft = 7;
//		System.out.println(wordFromListInLetters);
		System.out.println("<<<Welcome to Game - Hangman>>>");

		while (guessAttemptsLeft != 0) {
			if (!guessedWrongLetters.isBlank())
				System.out.println("Guessed letters which do not match:" + guessedWrongLetters);
			System.out.println(guessedWord);
			char guessedLetter = getRealLetterFromConsole("Guess a letter:");
			if (guessedLetterIsDuplicate(guessedWord, guessedLetter))
				continue;
			int matchCount = 0;
			for (int i = 0; i < wordFromListInLetters.length; i++) {
				matchCount = matchCount + matchedLetterCount(wordFromListInLetters, guessedLetter, matchCount, i);
				guessedWord = matchedLetterReplacement(wordFromListInLetters, guessedWord, guessedLetter, i);
			}
			if (matchCount > 0)
				System.out.println("You guessed right:");
			else {
				if (guessedLetterIsDuplicate(guessedWrongLetters, guessedLetter))
					continue;
				guessedWrongLetters = guessedWrongLettersAddNoDuplicates(guessedWrongLetters, guessedLetter);
				guessAttemptsLeft--;
				hangmanPainter.paint(guessAttemptsLeft);
				if (guessAttemptsLeft != 0)
					System.out.println("You guessed wrong, " + guessAttemptsLeft + " attempts left.");
				if (guessAttemptsLeft == 0) {
					System.out.println(guessedWord + " = " + chArrayToString(wordFromListInLetters));
					System.out.println("YOU ARE HANGED !");
					System.out.println("<<< --- Game Over --- >>>");
					break;
				}
			}
			if (chArrayToString(wordFromListInLetters).equals(guessedWord)) {
				System.out.println(guessedWord);
				hangmanPainter.paint(guessAttemptsLeft);
				System.out.println("YOU ARE DISCHARGED FROM YOUR SENTENCE !");
				System.out.println("<<< --- You Won --- >>>");
				
				break;
			}
		}
	}

	private String guessedWrongLettersAddNoDuplicates(String guesedWrongLetters, char typedLetter) {
		char[] b = guesedWrongLetters.toCharArray();
		int n = 0;
		for (int i = 0; b.length > i; i++) {
			if (b[i] == typedLetter)
				n++;
		}
		if (n == 0)
			guesedWrongLetters = guesedWrongLetters + " " + typedLetter;
		return guesedWrongLetters;
	}

	private boolean guessedLetterIsDuplicate(String guesedWrongLetters, char typedLetter) {
		char[] b = guesedWrongLetters.toCharArray();
		int n = 0;
		for (int i = 0; b.length > i; i++) {
			if (b[i] == typedLetter)
				n++;
		}
		if (n == 0)
			return false;
		System.out.println("You already guessed this letter");
		return true;
	}

	private String guesedEmptyWordGenerator(char[] letters) {
		String guesedWord = "";
		for (int i = 0; i < letters.length; i++)
			guesedWord = guesedWord + "-";
		return guesedWord;
	}

	private String matchedLetterReplacement(char[] letters, String guesedLetters, char typedLetter, int i) {
		if (letters[i] == typedLetter) {
			guesedLetters = replaceLetter(guesedLetters, i, typedLetter);
		}
		return guesedLetters;
	}

	public int matchedLetterCount(char[] letters, char typedLetter, int count, int i) {
		if (letters[i] == typedLetter)
			count++;
		return count;
	}

	public String selectRandomWordFromList(ArrayList<String> words) {
		Random rnd = new Random();
		String randomStr = words.get(rnd.nextInt(0, words.size()));
		return randomStr.toUpperCase();

	}

	private char getRealLetterFromConsole(String statement) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(statement);
			String text = sc.nextLine();
			char letter;
			if (text.length() == 1) {
				letter = text.charAt(0);
				return Character.toUpperCase(letter);
			} else
				System.out.println("Must be one letter");
		}
	}

	public String replaceLetter(String str, int index, char replace) {
		if (str == null) {
			return str;
		} else if (index < 0 || index >= str.length()) {
			return str;
		}
		char[] chars = str.toCharArray();
		chars[index] = replace;
		return String.valueOf(chars);
	}

	public String chArrayToString(char[] arg) {
		return new String(arg);

	}
}
