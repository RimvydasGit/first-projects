import java.util.HashMap;
import java.util.Map.Entry;


public class DuomenuBaze implements Saugykla {

	HashMap<Integer, Info> obj = new HashMap<>();
	@Override
	public void saugotiInfo(Info info) {
		obj.put(info.getId(), info);
		
	}

	@Override
	public Info rastiInfo(int id) {
		System.out.println("Rasta duomenu bazeje pagal ID("+ id+") : " + obj.get(id));
		return obj.get(id);
		
	}

	@Override
	public Info rastiInfo(String zodis) {
		for (Entry<Integer, Info> index : obj.entrySet()) {
			if (index.getValue().arYraTekste(zodis)) {
				System.out.println("Rasta duomenu bazeje pagal zodi("+zodis+") : " + index.getValue());
				return index.getValue();
				}
		}		
		return null;
	}
	
}
