

import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {
	KategorijaP kategorija;
	static int counter = 0;
	public PajamuIrasas(LocalDateTime data, boolean arIBanka, String papildomaInfo,
			float suma,KategorijaP kategorija)
			{
		super(data, arIBanka, papildomaInfo, suma);
		this.id = counter;
		counter++;
		this.kategorija = kategorija;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return  getDate()
				+ " - ["+ (id+1) + "] : " + "Ar bankinis: "+ arIBanka+ " Kategorija: " + kategorija +  " Suma: " + suma + " EUR " + " Komentaras: " + papildomaInfo;
	}
	public KategorijaP getKategorija() {
		return kategorija;
	}
	public void setKategorija(KategorijaP kategorija) {
		this.kategorija = kategorija;
	}
	
	
	
	
//	public PajamuIrasas(KategorijaP kategorija) {
		
//		this.kategorija = kategorija;
//	}
}
		
