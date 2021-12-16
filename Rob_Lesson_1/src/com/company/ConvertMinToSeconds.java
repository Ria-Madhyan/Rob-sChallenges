package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConvertMinToSeconds {
    public static int ConvertMinToSeconds (){
        Scanner min = new Scanner(System.in);
        System.out.println("Please enter the minutes");
        String minutes = min.next();
        int mins = parseInt(minutes);
        if ( mins < 1) {
            System.out.println("Invalid Number");
            return -1;
        } else {
        int totalSeconds = mins * 60;
        System.out.println(mins + " minutes is " + totalSeconds + " seconds ");
        return totalSeconds;}
    }
}
