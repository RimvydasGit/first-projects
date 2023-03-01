
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
	
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma = suma;
	}
	
	public boolean isArIBanka() {
		return arIBanka;
	}

	public void setArIBanka(boolean arIBanka) {
		this.arIBanka = arIBanka;
	}

	public String getPapildomaInfo() {
		return papildomaInfo;
	}

	public void setPapildomaInfo(String papildomaInfo) {
		this.papildomaInfo = papildomaInfo;
	}

	public String getDate() {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("YYYY MM dd HH:mm");
		String formatuotaData = data.format(form);
		return formatuotaData;
	}
	
}
//data.getYear() + "/" + data.getMonth() + "/"+ data.getDayOfMonth()+ "     "+ data.getHour() +":" +data.getMinute() +":"+data.getSecond()

