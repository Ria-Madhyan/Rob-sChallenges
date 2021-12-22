package com.company;

public class BMW extends Car{
    public BMW(int doors, String model) {
        super(doors, model);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW is well known for its history of inline-six (straight-six) engines, & it has started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW M Series have a very good acceleration.");;
    }

    @Override
    public void brake() {
        System.out.println("BMW uses Brembo for their supply of brake calipers.");
    }
}
