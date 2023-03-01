package Uzd3_Generuok;

public class Pvz {

}
import java.util.Random;
public abstract class Skaicius {
    Random rd = new Random();
    protected int [] arr = new int[10];
    public abstract void generuok();
    public int suma() {
        int rezultatas = 0;
        for (int i = 0; i < arr.length; i++) {
            rezultatas += arr[i];
        }
        return rezultatas;
    }
    public void spausdinti() {
        System.out.println("Veikia Skaicius metodas ir rodome rezultata: " + arr);
    }
}
public class NelyginisSkaicius extends Skaicius {
    @Override    public void generuok() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50) * 2 + 1;    
        }
    }
}