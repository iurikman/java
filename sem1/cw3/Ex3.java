package org.example.sem1.cw3;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(replHalfsOfString("123456"));
    }

    public static String replHalfsOfString(String str) {
        int length = str.length();
        String sub1 = str.substring(0, length / 2);
        String sub2 = str.substring(length / 2 , length);
        return sub2 + sub1;
    }
}
