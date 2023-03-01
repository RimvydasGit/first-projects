package Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList();
		LinkedList<Integer> linked = new LinkedList();
		
		generuok(array);
		generuok(linked);
		linked.clear();
		generuok2(linked);
	
	}

	static void generuok(Collection<Integer> list) {
		long startTime = System.nanoTime();
		Random rnd = new Random();
		int i = 0;
		while (i <= 1000000) {
			list.add(rnd.nextInt(1, 101));
			i++;
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000;
		System.out.println("*: " + duration);
	}
	static void generuok2(LinkedList<Integer> list) {
		long startTime = System.nanoTime();
		Random rnd = new Random();
		int i = 0;
		while (i <= 1000000) {
			list.addLast(rnd.nextInt(1, 101));
			i++;
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000;
		System.out.println("*: " + duration);
	}

	static void padidink(Collection<Integer> list) {
		for (int e : list) {
			if (e < 50) e +=10;
		}
	}
}
