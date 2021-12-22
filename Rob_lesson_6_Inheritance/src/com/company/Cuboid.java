package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;}
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double volume = getWidth() * getLength() * height;
        System.out.println("Volume is " + volume + "m\u00B3");
        return volume;
    }

}
