package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Laptop {
    String name;
    Integer ram;
    Integer gb;
    Integer year;
    String type;


    public Laptop(String name, Integer ram, Integer gb, Integer year, String type) {
        this.name = name;
        this.ram = ram;
        this.gb = gb;
        this.year = year;
        this.type = type;
    }

    public static List<Laptop> GenLaptopList () {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Asus", 16, 256, 2021, "work"));
        laptopList.add(new Laptop("HP", 8, 128, 2023, "game"));
        laptopList.add(new Laptop("Asus", 4, 512, 2022, "work"));
        laptopList.add(new Laptop("HP", 16, 1024, 2019, "game"));
        laptopList.add(new Laptop("Acer", 16, 512, 2019, "game"));
        laptopList.add(new Laptop("Asus", 16, 128, 2021, "work"));
        laptopList.add(new Laptop("HP", 16, 128, 2023, "work"));
        laptopList.add(new Laptop("Acer", 16, 512, 2019, "game"));
        laptopList.add(new Laptop("HP", 16, 1024, 2022, "work"));
        laptopList.add(new Laptop("Acer", 16, 256, 2021, "game"));
        return laptopList;
    }

    public static void PrintList (List<Laptop> resultList){
        for (Laptop laptop: resultList) {
            System.out.println("  Name:" + laptop.name +
                    "  RAM: " + laptop.ram +
                    "  GB: " + laptop.gb +
                    "  Year: " + laptop.year +
                    "  Type: " + laptop.type +
                    "");
        }
    }
    public static List<Laptop> Filter (List<Laptop> laptopList) {
        List<Laptop> resultList = new ArrayList<>(laptopList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальные параметры ноутбука. \nRam: ");
        Integer minRam = scanner.nextInt();
        System.out.println("GB: ");
        Integer minGb = scanner.nextInt();
        System.out.println("Год: ");
        Integer minYear = scanner.nextInt();

        for (int i = 0; i < resultList.size(); i++) {

            if (resultList.get(i).ram < minRam) {
                resultList.remove(i);
                i--;
            }
            else if (resultList.get(i).gb < minGb) {
                resultList.remove(i);
                i--;

            }
            else if (resultList.get(i).year < minYear) {
                resultList.remove(i);
                i--;

            }
        }
        PrintList(resultList);
        return resultList;
    }
}

