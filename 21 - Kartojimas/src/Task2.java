import java.time.LocalDate;


public class Task2 {

	public void weekDays() {
		LocalDate time = LocalDate.now();
		LocalDate time2 = time.plusMonths(1);
		int counter = 0;
		System.out.println(time);
		System.out.println(time2);
		while ((time.isBefore(time2)) || (time.equals(time2))) {
			counter++;
			System.out.println(counter + ": " + time + " - " + time.getDayOfWeek());
			time = time.plusDays(1);
		}
	}

}
