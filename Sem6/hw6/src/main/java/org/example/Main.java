package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Laptop.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>(GenLaptopList());
        PrintList(laptopList);
        Filter(laptopList);
    }

}