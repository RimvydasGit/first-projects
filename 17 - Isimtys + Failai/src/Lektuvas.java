import java.util.Random;

public class Lektuvas {
	static Random rnd = new Random();

	public void isskleistiVaziuokle() {

		try {
			
			System.out.println("OK: vaziuokle sekmingai isskleista");
		vaziuokle();
		} catch (LaikinaKlaida e) {
			System.out.println(e.pranesimas);
		} catch (SvarbiKlaida e) {
			System.out.println(e.pranesimas);
			
		} catch (VaziuoklesIsskleidimoKlaida e) {
			System.out.println(e.priezastis);
			
		} finally {
			System.out.println("INFO: lektuvas skrenda");
		}

	}

	public void vaziuokle() throws VaziuoklesIsskleidimoKlaida, SvarbiKlaida, LaikinaKlaida {
		int a = rnd.nextInt(0, 10);
		switch (a) {
		case 0:
			throw new SvarbiKlaida("Sprogo ratas");
		case 1:
			throw new LaikinaKlaida("Pazeistas korpusas");
		case 2:
			throw new VaziuoklesIsskleidimoKlaida("Teroristai");
		case 3:
			throw new VaziuoklesIsskleidimoKlaida("Vairuotojas rip");
		case 4:
			throw new VaziuoklesIsskleidimoKlaida("Nukrito sparnas");
		case 5:
			throw new SvarbiKlaida("Sugedo variklis");
		case 6:
			throw new LaikinaKlaida("Pauksciu ataka");
		case 7:
			throw new VaziuoklesIsskleidimoKlaida("Pataike raketa");
		case 8:
			throw new LaikinaKlaida("Atsidare durys");
		case 9:
			throw new VaziuoklesIsskleidimoKlaida("Truksta kuro");
		case 10:
			throw new VaziuoklesIsskleidimoKlaida("Truksta varzto");
		}
	}

}
