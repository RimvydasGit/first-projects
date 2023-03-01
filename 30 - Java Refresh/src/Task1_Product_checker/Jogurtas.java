package Task1_Product_checker;
public class Jogurtas extends Produktas{

	@Override
	protected boolean arGalimaVartoti() {
		return dienos <= 2  ;
	}

}
