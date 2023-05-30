package org.example.sem1.cw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(subtractProductAndSum(a));
        scanner.close();
    }

    /**
     *
     * @param a задаваемое число
     * @return возвращает произведение минус сумма.
     */
    public static int subtractProductAndSum(int a) {
        int product = 1;
        int summ = 0;
        while (a != 0) {
            product *= a % 10;
            summ += a % 10;
            a /= 10;
        }
        return product - summ;
    }
}
