package org.example;

import com.google.common.collect.Range;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Range<Integer> integers = Range.closed(10, 79);
        Range<Integer> integers1 = Range.openClosed(9, 45);

        int value1 = 15;
        int value2 = 8;

        System.out.println("Ar skaičius " + value1 + " priklauso integers? " + integers.contains(value1));
        System.out.println("Ar skaičius " + value1 + " priklauso integers1? " + integers1.contains(value1));
        System.out.println("Ar skaičius " + value2 + " priklauso integers? " + integers.contains(value2));
        System.out.println("Ar skaičius " + value2 + " priklauso integers1? " + integers1.contains(value2));


        Range<Integer> intersection = integers.intersection(integers1);
        Range<Integer> span = integers.span(integers1);

        System.out.println("susikirtimas: " + intersection);
        System.out.println("bendras intervalas: " + span);
    }
}