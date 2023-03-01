package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            System.out.println("Worker-1" + " Pradeda darba");
            });
        t1.start();
        t1.join();
        System.out.println("Progrma baigia darba");

        //Thread.sleep(3000);
       //System.out.println("I am Lazy today");
}
}