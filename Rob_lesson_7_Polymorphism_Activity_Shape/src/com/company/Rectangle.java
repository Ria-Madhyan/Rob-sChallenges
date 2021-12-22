package com.company;

public class Rectangle extends Shape {

    //We are using the same render method from Parent class & overriding it
    // This can be done by right click => Generate => OverrideMethods
    // Select the method which you want to Override & select OK
    // then remove super.render() from the method & what you want from this method.

    @Override
    public void render() {
        System.out.println("I am Rectangle, I have 4 sides. Two of my sides are equal");
    }
}
