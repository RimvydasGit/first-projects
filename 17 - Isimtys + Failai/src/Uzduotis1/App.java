package Uzduotis1;

import java.io.*;

public class App {

	public static void main(String[] args)  {
		String vardas = "Rimvydas Ceskevicius";
		String failovardas = "vardas";
		String failovardas2 = "vardasreverse";
		try {
			Failas.writer(vardas, failovardas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Failas.writer(Failas.reverse(Failas.reader()),failovardas2 );
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}