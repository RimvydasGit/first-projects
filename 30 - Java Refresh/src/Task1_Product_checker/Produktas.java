package Task1_Product_checker;
import java.util.Random;

public abstract class Produktas {
	Random rnd = new Random();
	protected int dienos;

	 abstract boolean arGalimaVartoti() ;
		public Produktas() {
			dienos = rnd.nextInt(1,6);
		}
}