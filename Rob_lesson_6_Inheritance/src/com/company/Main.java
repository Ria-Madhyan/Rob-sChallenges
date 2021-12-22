package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle newRectangle = new Rectangle(7.8, 4.4);
        Rectangle newRectangle1 = new Rectangle(-9, 4.4);
        Rectangle newRectangle2 = new Rectangle(7.8, -3);
        newRectangle.getArea();
        newRectangle1.getArea();
        newRectangle2.getArea();

        Cuboid newCuboid = new Cuboid(2,3,5);
        Cuboid newCuboid1 = new Cuboid(-3,3,5);
        Cuboid newCuboid2 = new Cuboid(2,-5,5);
        Cuboid newCuboid3 = new Cuboid(2,3,-5);
        newCuboid.getArea();
        newCuboid.getVolume();
        newCuboid1.getVolume();
        newCuboid2.getVolume();
        newCuboid3.getVolume();

        System.out.println(Math.pow(2,3));

    }
}
