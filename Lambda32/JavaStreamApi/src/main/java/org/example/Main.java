package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Java Stream API
//        List<Integer> skaiciai = List.of(45,44,33,25,22,21,17,8,72);
//        List<Integer> naujas = skaiciai
//                .stream()
//                .filter((e) -> e > 40)
//                .filter((e) -> e % 2 == 0)
//                .toList();
//        System.out.println(naujas);
       // List<Integer> naujas =
                Stream.generate(() -> new Random().nextInt(100))
                .limit(20)
                .filter(e -> e%2 != 0)
                .filter(e -> e%3 != 0)
                .sorted()
                .forEach(e -> System.out.println(e));

    }
}