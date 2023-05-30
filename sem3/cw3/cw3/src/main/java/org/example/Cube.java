package org.example;

public class Cube {
    public Integer length;
    public String color;
    public String material;

    public Cube (Integer length, String color, String material){
        this.length = length;
        this.color = color;
        this.material = material;
    }

    public Integer GetVolume (Integer length) {
        return length*length*length;
    }
}
