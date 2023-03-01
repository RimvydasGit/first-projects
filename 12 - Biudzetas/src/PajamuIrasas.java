import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PajamuIrasas {
	LocalDateTime data;
	boolean arIBanka;
	String papildomaInfo;
	float suma;
	int irasoNumeris;
	KategorijaP kategorija;
	
	static int counter = 0;
	
	public PajamuIrasas(LocalDateTime data, boolean arIBanka, String papildomaInfo, float suma, KategorijaP kategorija) {
		this.irasoNumeris = counter;
		counter++;
		this.data = data;
		this.arIBanka = arIBanka;
		this.papildomaInfo = papildomaInfo;
		this.suma = suma;
		this.kategorija = kategorija;
	}
	@Override
	public String toString() {
		return  getDate()
				+ " - ["+ (irasoNumeris+1) + "] : " + kategorija +  " : " + suma + " EUR " + " Komentaras: " + papildomaInfo;
	}
	public String getDate() {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("YYYY MM dd HH:mm");
		String formatuotaData = data.format(form);
		return formatuotaData;
	}
}
//data.getYear() + "/" + data.getMonth() + "/"+ data.getDayOfMonth()+ "     "+ data.getHour() +":" +data.getMinute() +":"+data.getSecond()