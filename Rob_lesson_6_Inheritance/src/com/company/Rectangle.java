package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;}
        if (length < 0){
            this.length = 0;
        } else {
            this.length = length;}
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        double area = width*length;
        System.out.println("Area is " + area + "m\u00B2");
        return area;
    }


}
