package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(4,"unknown");
        Car myOldCar = new Ford(4, "Ford Fiesta");
        Car myCurrentCar = new WRV_Honda(4, "WRV");
        Car myNewCar = new BMW(4, "BMW");

        car.startEngine();
        car.accelerate();
        car.brake();

        myOldCar.startEngine();
        myOldCar.accelerate();
        myOldCar.brake();

        myCurrentCar.startEngine();
        myCurrentCar.accelerate();
        myCurrentCar.brake();

        myNewCar.startEngine();
        myNewCar.accelerate();
        myNewCar.brake();








    }
}
