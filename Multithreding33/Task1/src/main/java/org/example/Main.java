package org.example;
//Uzduotys su Multithreading:
//        1) Sukurti klase Work kuri paveldi Thread
//        2) Perrasyti run() metoda su savo sukurtu funkcionalumu
//        3) Isbandyti:
//        a) Paleisti su run()
//        b) Paleisti su start()
//        c) Kelis kartus paleisti veikianti thread
//        d) Isbandyti Thread metodus suspend(), resume(), interupt(), getName()
//        4) sukurti du thread, vienas veikia 5 sekundes, kitas 10.
//        5) Baigus darba pirmam threadui, sustabdyti antra ir isvesti pranesima, kad programa baigia darba


public class Main {
    public static void main(String[] args) throws Exception {


        Work w1 = new Work("1",5000);
        Work w2 = new Work("2",10000);
//        w1.run();
//        w2.run();
        w1.start();
        w2.start();
        w1.join();
        w2.suspend();
        System.out.println("Gija 1 uzbaigta, Gija 2 tesia darba");
        w2.resume();
        w2.join();
        //System.out.println("\n\n Gija baige darba!");
    }
}