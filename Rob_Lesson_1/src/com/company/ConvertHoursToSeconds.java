package com.company;

public class ConvertHoursToSeconds {
    public static int ConvertHoursToSeconds (int hr){
        if (hr < 1) {
            System.out.println("Invalid Number");
            return -1;
        } else {
            int totalSeconds = hr * 60 * 60;
            System.out.println(totalSeconds);
            return totalSeconds;}
    }
}
