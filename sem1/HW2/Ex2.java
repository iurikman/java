package org.example.sem1.HW2;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(reverseWords("      blue     sky in  empty  "));
    }

    public static String reverseWords(String s) {
        while (s.contains("  ")) {
            String replace = s.replace("  ", " ");
            s = replace;
        }
        String[] array = s.trim().split(" ");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {

            if (i == 0) {
                result += array[i];
            }
            else {
                result += array[i] + " ";
            }
        }
        return result;
    }

}
