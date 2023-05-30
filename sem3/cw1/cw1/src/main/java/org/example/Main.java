package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product pr = new Product("QWE", "zxc", 3);
        Product pr2 = new Product("QWE", "zxc2", 3);
        Product pr3 = new Product("QWE", "zxc2", 3);
        List<Product> productList = new ArrayList<>();
        productList.add(pr);
        productList.add(pr2);
        productList.add(pr3);
        System.out.println(productList);
        Scanner scanner = new Scanner(System.in);
        String searchNameOfProduct = scanner.nextLine();
        Integer exportVolume = 0;
        List<String> countryList = new ArrayList();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.equals(searchNameOfProduct)) {
                exportVolume += productList.get(i).volume;
                if (!countryList.contains(productList.get(i).country)) {
                    countryList.add(productList.get(i).country);
                }
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println("exportVolume = " + exportVolume);
    }
}