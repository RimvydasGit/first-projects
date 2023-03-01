import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Main {

	public static void main(String[] args) {
//		LocalDateTime laikas = LocalDateTime.now();
//		System.out.println(laikas);
//		LocalDateTime naujasLaikas = laikas.plusHours(10000);
//		//System.out.println(naujasLaikas);
//		
//		LocalDate   siandien    =   LocalDate.now();
//		String  formatuotaSiandien  =   siandien.format(DateTimeFormatter.BASIC_ISO_DATE);
//		DateTimeFormatter   formateris  =   DateTimeFormatter.ofPattern("yyyy!!MM!!dd");  
//		formatuotaSiandien      =   siandien.format(formateris);
//		
//		LocalDateTime laikas1 = LocalDateTime.now();
//		laikas1 = laikas1.minusHours(3);
//		System.out.println(laikas1);
//		laikas1 = laikas.plusDays(5);
//		System.out.println(laikas1);
//		formateris = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
//		System.out.println("Senass laikas: " + laikas + " Naujas laikas: " + formateris.format(laikas1));
//		
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
//		System.out.println("Iveskite laika: ");  
//		Scanner sc = new Scanner(System.in);
//		String textFromConsole = sc.next();  sc.close();
//		LocalTime time = LocalTime.parse(textFromConsole, f);
//		System.out.println("Ivestas laikas: " + time);  
//		LocalTime time2 = time.plusHours(2);
//		time2 = time2.plusMinutes(15);
//		System.out.println("pridejus dvi valandas 15 min: " + time2);
//		if (time.compareTo(time2) > 0) {
//		System.out.println("Laikas 2 yra mazesnis uz laikas 1");}
//		else {System.out.println("Laikas 2 yra didesnis uz laikas 1");}
		/////////////////
//		Mini užduotėlė Duotos datos: 1919-04-04 , 1922-12-21 , 1926-06-07 , 1931-12-11 , 2002-12-22 , 2009-05-17, 2014-05-11
//		Surasti, kokia savaitės diena buvo šiomis datomis
		////////////
//		String[] datos = { "1919-04-04", "1922-12-21", "1926-06-07", "1931-12-11", "2002-12-22", "2009-05-17",
//				"2014-05-11" };
//		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		LocalDate date2 = LocalDate.parse(datos[0], f);
//		// LocalDate data = LocalDate.of(1919, 04, 04);
//		int i = (0);
//		while ((datos.length > i) && (datos.length != i)) {
//			date2 = LocalDate.parse(datos[i], f);
//			System.out.println(date2.toString()+ " " + date2.getDayOfWeek());
//			i++;
//		}
		/////////
		//Surasti kiem metuose penktadieniu 13 menesio diena?
		/////////
//		LocalDate data = LocalDate.of(2023, 01, 01);
//		LocalDate data2 = LocalDate.of(2024, 01, 01);
//		int fri = 0;
//		while (!(data.isAfter(data2))) {
//			if ((data.getDayOfWeek() == DayOfWeek.FRIDAY) && (data.getDayOfMonth() == 13)) fri = (fri + 1);
//			data = data.plusDays(1);
//		}
//		System.out.println(fri);
		////////////
		//////////
		//////////
//		StringBuilder Liepa = new StringBuilder("Liepa");
//		StringBuilder Antradienis = new StringBuilder("Antradienis");
//		System.out.println(Liepa.append(Antradienis));
//		System.out.println(Liepa.append(Antradienis)
//				.reverse()
//				.delete(0, 11));
//		System.out.println(Liepa.append(Antradienis)
//				.reverse()
//				.delete(0, 5)
//				.delete(4, 15)
//				.delete(5, 10)
//				.replace(5, 6, "i"));
//		System.out.println(Liepa.append(Antradienis)
//				.reverse()
//				.delete(0, 5)
//				.delete(3, 16)
//				.append("2018"));
//		System.out.println(Liepa.append(Antradienis)
//				.reverse()
//				.delete(0, 5)
//				.delete(3, 16)
//				.append("om2018"));
//		System.out.println(Liepa.append(Antradienis)
//				.reverse()
//				.delete(0, 5)
//				.delete(3, 16)
//				.append("om20180")
//				.length());
		///////////////////
				
//		String taip = "T";
//		while (taip.equalsIgnoreCase("T")) {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Iveskite savo zodi:");
//				String zodis = sc.next();
//				System.out.println("Zodis " + zodis + " yra polindromas: " + Utils.polindromai(zodis));
//				System.out.println("Ar norite testi:");
//				taip = sc.next();
//		}
		
		StringBuilder sb = new StringBuilder("Labos");
		int va = sb.lastIndexOf("a", 2);
		System.out.println(va);
		//////////////
	}  
	
}
