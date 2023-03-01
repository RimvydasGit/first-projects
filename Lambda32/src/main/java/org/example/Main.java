package org.example;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> arVyresnisNei20 = (a) -> a > 20;
        patikrink(arVyresnisNei20);
    }
//        Zmogus jonas = () -> System.out.println("Labas, as Petras");
//        Zmogus petras = () -> System.out.println("Labas, as Jonas");
//        jonas.pasisveikink();
//        petras.pasisveikink();
//        pakalbink(jonas);
//        pakalbink(petras);
//        skaiciuok((sk1, sk2) -> sk1 + sk2);
//        skaiciuok((sk1, sk2) -> sk1 - sk2);
//        skaiciuok((sk1, sk2) -> sk1 * sk2);
//            vartok(t -> System.out.println("Labas " + t));
//
//
//
//    }
//    static void  vartok(Consumer<String> vartotojas){
//        vartotojas.accept("Rytas");
//    }
//    static void skaiciuok(Veiksmas veiksmas){
//      int rezultatas = veiksmas.atlik(5,7);
//      System.out.println(rezultatas);
//    }

        static void  patikrink(Predicate<Integer> salyga){
       System.out.println(salyga.test(30)) ;
        }
class Suma implements BiFunction<Integer,Integer,Integer>{


    @Override
    public Integer apply(Integer t, Integer u) {
        return t + u;
    }
//    static void skaiciuok(BiFunction<Integer,Integer,Integer>){
//        Suma.apply(7,5,3);
//    }
}
}
