package org.example;

import java.util.Random;

public class Worker implements Runnable{

    @Override
    public void run(){
        System.out.println("Worker-1" + " Pradeda darba");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            System.out.println("Worker-1"  + " Baigia darba");

    }

}
