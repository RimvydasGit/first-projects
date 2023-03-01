import java.util.Random;

public class Task7 {
	public void rockRun() {

		String printThis = rockPaperScissors(random_RPS(), random_RPS());

		System.out.println(printThis);
	}

	private RPS random_RPS() {
		Random rnd = new Random();
		int a = rnd.nextInt(0, 3);
		if (a == 1)
			return RPS.PAPER;
		if (a == 2)
			return RPS.ROCK;
		return RPS.SCISSORS;

	}

	private String rockPaperScissors(RPS first, RPS second) {
		System.out.println("First: " + first + " Second: " + second);
		if (first.equals(second))
			return "Lygiosios";
		if ((first == RPS.ROCK) && (second == RPS.SCISSORS))
			return "First won";
		if ((first == RPS.ROCK) && (second == RPS.PAPER))
			return "Second won";
		if ((first == RPS.SCISSORS) && (second == RPS.ROCK))
			return "Second won";
		if ((first == RPS.SCISSORS) && (second == RPS.PAPER))
			return "First won";
		if ((first == RPS.PAPER) && (second == RPS.ROCK))
			return "First won";
		if ((first == RPS.PAPER) && (second == RPS.SCISSORS))
			return "Second won";
		return "Turetu nemesti";

	}

	private enum RPS {
		ROCK, PAPER, SCISSORS;
	}
}
