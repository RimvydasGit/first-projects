package lt.codeacademy.learn.ligonine.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vizitas {
	Pacientas pacientas;
	LocalDateTime pradzia;
	LocalDateTime pabaiga;
	int gydytojoID ;
	public Vizitas( Pacientas pacientas, LocalDateTime pradzia, LocalDateTime pabaiga) {
		super();
		this.pacientas = pacientas;
		this.pradzia = pradzia;
		this.pabaiga = pabaiga;
		
	}


	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		return pacientas + " nuo " + pradzia.format(formatter) + " iki " + pabaiga.format(formatter) ;
	}
	
}
