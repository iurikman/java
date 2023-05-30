package org.example.sem1.HW1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDiff(n, scanner));
        scanner.close();
    }

    /**
     *
     * @param n количество чисел в последовательности
     * @return кол-во положительных чисел, идущих перед отрицательным
     */
    public static int countDiff(int n, Scanner scanner){
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0){
                count += a;
            }
            a = b;
        }
        return count;
    }
}
