package BiudzetasUpgraded;

import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {
	KategorijaI kategorija;
	static int counter = 0;
	public IslaiduIrasas(LocalDateTime data, boolean arIBanka, String papildomaInfo, float suma,
			KategorijaI kategorija) {
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
		return getDate() + " - [" + (id +1) + "] : " + kategorija + " : " + suma + " EUR " + " Komentaras: "
				+ papildomaInfo;
	}

}
