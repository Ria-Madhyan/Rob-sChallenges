package com.company;

public class WRV_Honda extends Car{
    public WRV_Honda(int doors, String model) {
        super(doors, model);
    }

    @Override
    public void startEngine() {
        System.out.println("WRV's  Diesel engine is 1498 cc while the Petrol engine is 1199 cc, & it has started");
    }

    @Override
    public void accelerate() {
        System.out.println("WRV acceleration details,Petrol - 13.29kmpl (City) / 18.06kmpl (Highway) Diesel - 15.35kmpl (City) / 25.88kmpl (Highway)");;
    }

    @Override
    public void brake() {
        System.out.println("WRV has disc brakes at the front, and drum brakes in the rear wheels");
    }


}
