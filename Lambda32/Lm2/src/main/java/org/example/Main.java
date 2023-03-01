package org.example;

import java.util.function.*;


public class Main {
    public static void main(String[] args) {

    BiConsumer<Integer,Integer> suma = (a,b) -> System.out.println(a + b);
    BiConsumer<Integer,Integer> dalyba = (a,b) -> System.out.println(a / b);
    BiConsumer<Integer,Integer> reverse = (a,b) -> System.out.println(b /a);
    BiFunction<Integer,Integer, Float> division = (a,b) -> (a*1f / b);
    BiPredicate<Integer,Integer> firstBigger = (a,b) -> a < b;
    BooleanSupplier bs = () -> true;
    int x = 120;
    int y = 110;
    bs = () -> x > y;
    System.out.println(bs.getAsBoolean());
    suma.accept(4,2);
    dalyba.accept(4 ,2);
    reverse.accept(4,2);
    System.out.println(division.apply(5,2));
    System.out.println(firstBigger.test(5,6));

}




}



