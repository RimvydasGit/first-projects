package lt.codeacademy.learn.ligonine.entities;

import lt.codeacademy.learn.ligonine.exceptions.BadDataException;

//DTO
public class Pacientas {
	
	public int id;
	public String name;
	public String ligosIstorija;

	
	public String getName() {
		return name;
	}
	
	public Pacientas(int id, String name, String ligosIstorija) {
		super();
		this.id = id;
		this.name = name;
		this.ligosIstorija = ligosIstorija;
	}
	public Pacientas(String line) throws BadDataException {
		
		String[] args = line.split(";");
		if (args.length != 3) {
			throw new BadDataException("Negalima sukurti paciento pagal" + line);
		}
		this.id = Integer.parseInt(args[0]);
		this.name = args[1];
		this.ligosIstorija = args[2];
	}
	@Override
	public String toString() {
		return id + ": " + name + ", " + ligosIstorija;
	}
	public int getId() {
		return id;
	}
	public String getDataForFile() {
		return id + ";" + name + ";" + ligosIstorija;
	}

	public void setName(String name) {
		this.name = name;
		
	}


	public String getLigosIstorija() {
		
		return ligosIstorija;
	}
}
