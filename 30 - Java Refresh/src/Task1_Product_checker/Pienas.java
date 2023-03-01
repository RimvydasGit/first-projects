package Task1_Product_checker;
public class Pienas extends Produktas{

	@Override
	protected boolean arGalimaVartoti() 
	{
	return dienos <= 2 ;
	}
}
