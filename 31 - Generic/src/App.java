import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
//		Box<Integer> boxInt = new Box<>();
//		boxInt.set(50);
//		System.out.println(boxInt.get());
//		
//		Box<String> boxStr = new Box<>();
//		boxStr.set("Labas");
//		System.out.println(boxStr.get());
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		printArray(list1, list2);
	}
	static <T,N> void printArray(ArrayList<N> list1,ArrayList<T> list2) {
		for (N e : list1) {
			System.out.println(e);
		}
		for (T i : list2) {
			System.out.println(i);
		}
	}

//class Box<T> {
//	private T obj;
//
//	public void set(T o) {
//		this.obj = o;
//	}
//
//	public T get() {
//		return obj;
//	}
}
