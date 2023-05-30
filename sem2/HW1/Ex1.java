package org.example.sem2.HW1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the count of numbers, please: ");
        int countNumbers = scanner.nextInt();
        if (countNumbers == 2) {
            System.out.println();
        }
        else {
            int summ = 0;
            int j = 2;
            int i = 2;
            while (i <= countNumbers) {
                if (i % j == 0 && i != j) {
                    i++;
                    j = 2;
                } else if (j == i) {
                    summ += i;
                    i++;
                    j = 2;
                } else j++;
            }
            System.out.println(summ);
        }
    }
}
