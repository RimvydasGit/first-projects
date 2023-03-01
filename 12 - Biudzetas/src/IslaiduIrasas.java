import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IslaiduIrasas {
	LocalDateTime data;
	boolean arIBanka;
	String papildomaInfo;
	float suma;
	int irasoNumeris;
	KategorijaI kategorijaI;
	
	static int counter = 0;
	
	public IslaiduIrasas(LocalDateTime data, boolean arIBanka, String papildomaInfo, float suma,
			KategorijaI kategorijaI) {
		this.irasoNumeris = counter;
		this.data = data;
		this.arIBanka = arIBanka;
		this.papildomaInfo = papildomaInfo;
		this.suma = suma;
		this.kategorijaI = kategorijaI;
	}
	@Override
	public String toString() {
		return  getDate()
		+ " - ["+ (irasoNumeris+1) + "] : " + kategorijaI +  " : " + suma + " EUR " + " Komentaras: " + papildomaInfo;
	}
	public String getDate() {
		DateTimeFormatter form = DateTimeFormatter.ofPattern("YYYY MM dd HH:mm");
		String formatuotaData = data.format(form);
		return formatuotaData;
	}
}
