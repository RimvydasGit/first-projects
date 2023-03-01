
import java.util.ArrayList;
import java.util.HashMap;

public class Availability {

	public void run() {
		@SuppressWarnings("unused")
		FileUtils fileUtils = new FileUtils();
		HashMap<String, Record> hashOfRecords = new HashMap<>();
		ArrayList<String> dataRowsFromAllFiles = FileUtils.getDataRowsfromFiles();
		ArrayList<Record> listOfRecords = new ArrayList<>();
		putDataToRecords(dataRowsFromAllFiles, listOfRecords);
		fixDuplicateRecords(listOfRecords);

		arrayListToHashMap(listOfRecords, hashOfRecords);
		System.out.println(hashOfRecords);
	}

	private void arrayListToHashMap(ArrayList<Record> listOfRecords, HashMap<String, Record> hashOfRecords) {
		int e = 1;
		for (int i = 0; i < listOfRecords.size(); i++) {

			hashOfRecords.put(("" + e++), listOfRecords.get(i));
		}
	}

	private void putDataToRecords(ArrayList<String> dataRowsFromAllFiles, ArrayList<Record> listOfRecords) {
		for (int i = 0; i < dataRowsFromAllFiles.size(); i++) {
			@SuppressWarnings("unused")
			String id;
			String dataRow = dataRowsFromAllFiles.get(i);
			Record rec = new Record(Utils.getStringName(dataRow),
					Utils.textdateToLocalDateTimeObj(Utils.getStringJoinTime(dataRow)),
					Utils.textdateToLocalDateTimeObj(Utils.getStringLeaveTime(dataRow)),
					Utils.timeToMinutes(Utils.getStringDuration(dataRow)),
					Utils.getStringEmail(dataRow),
					Utils.getStringRole(dataRow),
					Utils.getStringId(dataRow));
			listOfRecords.add(rec);
		}

	}

	private void fixDuplicateRecords(ArrayList<Record> listOfRecords) {
		ArrayList<Record> listOfRecordsFix = new ArrayList<>();
		for (Record e : listOfRecords) {
			if (listOfRecordsFix.contains(e)) {
				for (Record ele : listOfRecordsFix) {
					if (ele.equals(e)) {
						ele.setDuration(e.getDuration() + ele.getDuration());
					}
				}
			} else {
				listOfRecordsFix.add(e);
			}
		}
		listOfRecords = listOfRecordsFix;
	
	}

}
