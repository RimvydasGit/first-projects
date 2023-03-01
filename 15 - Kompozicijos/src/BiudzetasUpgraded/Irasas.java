package BiudzetasUpgraded;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class Irasas  {

	LocalDateTime data;
	boolean arIBanka;
	String papildomaInfo;
	float suma;
	int id;
	
	
	
	public Irasas(LocalDateTime data, boolean arIBanka, String papildomaInfo,
			float suma) {
		
		this.data = data;
		this.arIBanka = arIBanka;
		this.papildomaInfo = papildomaInfo;
		this.suma = suma;
		
	}
	
	
	public String getDate() {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("YYYY MM dd HH:mm");
		String formatuotaData = data.format(form);
		return formatuotaData;
	}
	
	
	
}
//data.getYear() + "/" + data.getMonth() + "/"+ data.getDayOfMonth()+ "     "+ data.getHour() +":" +data.getMinute() +":"+data.getSecond()

