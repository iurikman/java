package org.example;

import java.util.ArrayList;
import java.util.List;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Cube> cubes = GetCubes();
        int totalVolumeYellow = 0;
        int amountYellow = 0;
        int amountWooden = 0;
        for (Cube cube : cubes) {
            if (cube.color.equals("yellow")) {
                totalVolumeYellow += cube.GetVolume(cube.length);
                amountYellow += 1;
            }

            if (cube.material.equals("wood") && cube.length.equals(3)) {
                amountWooden += 1;
            }
        }

        System.out.println("amountYellow = " + amountYellow);
        System.out.println("totalVolumeYellow = " + totalVolumeYellow);
        System.out.println("amountWooden = " + amountWooden);
    }

        public static ArrayList<Cube> GetCubes () {
            ArrayList<Cube> cubes = new ArrayList<Cube>();
            cubes.add(new Cube(2, "yellow", "steel"));
            cubes.add(new Cube(3, "green", "wood"));
            cubes.add(new Cube(4, "blue", "plastic"));
            cubes.add(new Cube(3, "green", "wood"));
            cubes.add(new Cube(1, "green", "wood"));
            cubes.add(new Cube(2, "yellow", "steel"));
            cubes.add(new Cube(2, "yellow", "steel"));
            return cubes;
        }
    }