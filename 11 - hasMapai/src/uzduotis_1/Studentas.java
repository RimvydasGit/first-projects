package uzduotis_1;

import java.util.Objects;

//DTO - Data Transfer Object
public class Studentas {
	private String vardas;
	private int numeris;
	private String pavarde;
	private String universitetas;

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public int getNumeris() {
		return numeris;
	}

	public void setNumeris(int numeris) {
		this.numeris = numeris;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public String getUniversitetas() {
		return universitetas;
	}

	public void setUniversitetas(String universitetas) {
		this.universitetas = universitetas;
	}

	public Studentas(String vardas, String pavarde, int numeris, String universitetas) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.numeris = numeris;
		this.universitetas = universitetas;

	}

	@Override
	public String toString() {
		return " vardas = " + vardas + ", pavarde = " + pavarde + ", universitetas = "
				+ universitetas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeris, pavarde, universitetas, vardas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentas other = (Studentas) obj;
		return numeris == other.numeris && Objects.equals(pavarde, other.pavarde)
				&& Objects.equals(universitetas, other.universitetas) && Objects.equals(vardas, other.vardas);
	}

}