package com.company;

public class Ford extends Car{
    public Ford(int doors, String model) {
        super(doors, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford's Diesel engine is 1499 cc while Ford's Petrol engine is 1194 cc, & it has started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford Endeavour - The manual version of the SUV accelerates 0-100kmph in 13-14 seconds, while the automatic version takes 14-15 seconds");;
    }

    @Override
    public void brake() {
        System.out.println("Ford uses Motorcraft® brake pads");
    }
}
