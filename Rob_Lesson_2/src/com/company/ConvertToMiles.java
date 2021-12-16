package com.company;

public class ConvertToMiles {
    public static double toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <= 0) {
            return -1;
        } else {
            double miles = Math.round(kilometersPerHour/1.609 * 100);
            double milesPerHour = miles/100;
            return milesPerHour;}
    }

     public static void printConversion (double kilometersPerHour){
         if(kilometersPerHour <= 0) {
             System.out.println("Invalid Kilometers");
         } else {
        double result = toMilesPerHour(kilometersPerHour);
         System.out.println(kilometersPerHour + " Km/Hr " + result + " Mi/Hr ");}
    }


}
