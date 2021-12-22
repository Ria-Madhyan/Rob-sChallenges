package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private boolean hasWindscreen;

    public Car(int doors, String model) {
        this.doors = doors;
        this.wheels = 4;
        this.model = model;
        this.hasWindscreen = true;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public boolean isHasWindscreen() {
        return hasWindscreen;
    }

    public void startEngine(){
        System.out.println("The engine has started");
    }

    public void accelerate(){
        System.out.println("The accelerate is superb");
    }

    public void brake(){
        System.out.println("The brakes works well");
    }


}
