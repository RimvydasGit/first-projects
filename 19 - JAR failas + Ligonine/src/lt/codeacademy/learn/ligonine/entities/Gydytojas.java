package lt.codeacademy.learn.ligonine.entities;

import java.util.ArrayList;

public class Gydytojas {
	String name;
	String kabinetas;
	int GydytojoID  ;
	
	ArrayList<Vizitas> vizitai = new ArrayList<>();
	


	
	public Gydytojas(String name, String kabinetas, ArrayList<Vizitas> vizitai) {
		super();
		
		this.name = name;
		this.kabinetas = kabinetas;
		this.vizitai = vizitai;
	}
	@Override
	public String toString() {
		return "Gydytojas "+ name + ", kabineto Nr: " + kabinetas ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKabinetas() {
		return kabinetas;
	}
	public void setKabinetas(String kabinetas) {
		this.kabinetas = kabinetas;
	}
	public Gydytojas(String name, String kabinetas) {
		super();
		this.name = name;
		this.kabinetas = kabinetas;
	}
	public void paskirtiVizita(Vizitas vis) {
		vizitai.add(vis);
		
	}
	public ArrayList<Vizitas> getVizitai(){
		return vizitai;
	}
public  int getGydytojoID() {
		return GydytojoID;
	}
	
}
