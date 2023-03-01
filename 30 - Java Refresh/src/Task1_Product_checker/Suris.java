package Task1_Product_checker;

public class Suris extends Produktas{

	@Override
	protected boolean arGalimaVartoti() {
		return dienos <= 3 ;
	}

}
