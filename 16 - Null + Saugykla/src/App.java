
public class App {

	public static void main(String[] args) {
		//Draudimas draudimasT = new TPVCADraudimas("John doe", 1000, "ABC123", "Lietuva");//String apdraustojoVardas, double draudimoSuma, 
																						//String automobilioValstNr, String galiojimoTeritorija
		//Draudimas draudimasK = new KaskoDraudimas("Peter Peterson", 1200, "FGH220", 5); //String apdraustojoVardas, double draudimoSuma,
																						//String automobilioValstNr, double fransize
//		System.out.println("1." + draudimasT.getApdraustojoVardas() + "	Suma: " + draudimasT.getDraudimoSuma());
//		System.out.println("2." + draudimasK.getApdraustojoVardas() + "	Suma: " + draudimasK.getDraudimoSuma());
//		
//		if (draudimasT instanceof AutomobilioDraudimas){
//			System.out.println("1." + draudimasT.getApdraustojoVardas() + "	Suma: " + draudimasT.getDraudimoSuma() + " " + 
//		AutomobilioDraudimas.class.cast(draudimasT).getAutomobilioValstNr());
//			
//		}
//		if (draudimasK instanceof AutomobilioDraudimas){
//			System.out.println("2." + draudimasK.getApdraustojoVardas() + "	Suma: " + draudimasK.getDraudimoSuma() + " " + 
//		AutomobilioDraudimas.class.cast(draudimasK).getAutomobilioValstNr());
//		}
//		if (draudimasT instanceof KaskoDraudimas){
//		System.out.println("1." + draudimasT.getApdraustojoVardas() + "	Suma: " + draudimasT.getDraudimoSuma() + " " + 
//	AutomobilioDraudimas.class.cast(draudimasT).getAutomobilioValstNr() + " Teritorija: " +
//				TPVCADraudimas.class.cast(draudimasT).getGaliojimoTeritorija() + " fransize: " + KaskoDraudimas.class.cast(draudimasK).getFransize());
//			
//		}
//		if (draudimasK instanceof TPVCADraudimas){
//			System.out.println("1." + draudimasK.getApdraustojoVardas() + "	Suma: " + draudimasK.getDraudimoSuma() + " " + 
//		AutomobilioDraudimas.class.cast(draudimasK).getAutomobilioValstNr() + " Teritorija: " +
//					TPVCADraudimas.class.cast(draudimasK).getGaliojimoTeritorija() + " fransize: " + KaskoDraudimas.class.cast(draudimasK).getFransize());
//				
	//		}
	Saugykla saugyklaND = new NutolesDiskas();
	Saugykla saugyklaDM = new DuomenuBaze();
	Info info1 = new Info(0 ,"Raudona");
	Info info2 = new Info(1 ,"Geltona");
	saugyklaND.saugotiInfo(info1);
	saugyklaND.saugotiInfo(info2);
	saugyklaDM.saugotiInfo(info1);
	saugyklaDM.saugotiInfo(info2);
	;
	rastiPagalId(saugyklaDM, 1);
	rastiPagalId(saugyklaDM, 0);
	rastiPagalZodi(saugyklaND, "Geltona");
	}
		
	public static void saugoti(Saugykla saugykla, Info info) {
		saugykla.saugotiInfo(info);
	}	
	
	public static void rastiPagalId(Saugykla saugykla,int id) {
		System.out.println("App rasta pagal id ("+id+"): "+saugykla.rastiInfo(id));
		
	}
	public static void rastiPagalZodi(Saugykla saugykla, String zodis) {
		System.out.println("App rasta pagal zodi("+zodis+"): "+saugykla.rastiInfo(zodis));
		
	}
	
}
