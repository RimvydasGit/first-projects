import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Utils {

	public static String getStringName(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[0].trim();
	}
	public static String getStringJoinTime(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[1].trim();
	}
	public static String getStringLeaveTime(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[2].trim();
	}
	public static String getStringDuration(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[3].trim();
	}
	public static String getStringRole(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[5].trim();
	}
	public static String getStringEmail(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[4].trim();
	}
	public static String getStringId(String dataRow) {
		String[] rowArray = dataRow.split("\t");
		return rowArray[6].trim();
		
	}
	
	public static LocalDateTime textdateToLocalDateTimeObj(String timeString) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("M/d/yyyy, h:m:s a", Locale.ENGLISH);
		LocalDateTime time = LocalDateTime.parse(timeString, f);		
		return time;

	}

	public static int timeToMinutes(String timeString) {
		String partHours = "";
		String partMinutes = "";
	
		try {
			partHours = timeString.substring(0, timeString.indexOf(" ")).substring(0, timeString.indexOf("h"));
		} catch (Exception e) {
		}
		if (partHours.equals(""))
			partHours = "0";

		try {
			partMinutes = timeString.substring(timeString.indexOf(" ") + 1, timeString.indexOf("m"));
		} catch (Exception e) {
		}
		if (partMinutes.equals(""))
			partMinutes = "0";
		
		return Integer.parseInt(partHours) * 60 + Integer.parseInt(partMinutes);
	}

}
