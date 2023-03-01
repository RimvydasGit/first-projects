import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

	public static void main(String[] args) {
		SuperSkaiciuoklis obj1 = new SuperSkaiciuoklis();
		Kalkuliatorius obj2 = new SuperSkaiciuoklis();
		
		ArrayList<Kalkuliatorius> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		
//		System.out.println(obj1.suma(4, 8));
//		System.out.println(obj2.skirtumas(5, 7));
//		
//		int[] arr = {1,2,6,3,8,7,2};
//		Collection col = List.of(arr);
//		
//		ArrayList<Integer> list = new ArrayList<>(col);
//		System.out.println(list);
	}

}
