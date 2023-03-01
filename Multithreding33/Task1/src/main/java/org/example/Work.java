package org.example;

import java.util.Random;

public class Work extends Thread{

    Random rnd = new Random();
    String name ;
    int time;

    public Work(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        try {

            sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        int i = 0;

        System.out.print("\n" + name );
            for (int e = 1; e <=5;e++) {
                System.out.print("\n");

                for (int c = 1; c <= e; c++) {
                    System.out.print("+");
                    System.out.print("-");
                }
            }
            long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000;
         //  System.out.println("\n"+ name + "!!BAIGTA!!");
            System.out.println("\nTrukme:"+duration+ " - Gija nr "+ name + " !!BAIGTA!!");

    }
}
