package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape rectangle = new Rectangle();
        rectangle.render();

        Shape rhombus = new Rhombus();
        rhombus.render();

        Shape triangle = new Triangle();
        triangle.render();

        Shape square = new Square();
        square.render();

        Shape circle = new Circle();
        circle.render();

        Shape generalShape = new Shape();
        generalShape.render();



    }
}
