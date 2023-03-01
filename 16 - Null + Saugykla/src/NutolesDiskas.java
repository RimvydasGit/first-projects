import java.util.ArrayList;



public class NutolesDiskas implements Saugykla {
	ArrayList<Info> obj2 = new ArrayList<>();

	@Override
	public void saugotiInfo(Info info) {
		obj2.add(info);
	}

	@Override
	public Info rastiInfo(int id) {
		if ((id <0) && (id >= obj2.size())) {
			System.out.println("Nera tokio nario");
			return null;
		}
			
		System.out.println("Rasta nutolusiamediske bazeje pagal ID("+ id+") : " + obj2.get(id));
		return obj2.get(id);
			
	
	}

	@Override
	public Info rastiInfo(String zodis) {
		for (Info e : obj2) {
			if (e.getTekstas() == zodis) { 
				System.out.println("Rasta Rasta nutolusiamediske pagal zodi("+zodis+") : " + e);
				return e;
	
			}
		}		
		return null;
	}
	

}
