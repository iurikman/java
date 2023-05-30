package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);

        int min = numbers.get(0);
        int max = numbers.get(0);
        float summ = 0;
        for (Integer number: numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            summ += number;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("mid = " + summ/numbers.size());
    }
}