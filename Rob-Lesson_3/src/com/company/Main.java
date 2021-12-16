package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// CHALLENGE ONE - Create a New ArrayList & add 6 colors & sout
        ArrayList<String> colors2 = new ArrayList<>(Arrays.asList("black", "white", "purple"));
        System.out.println(colors2);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);

        colors.addAll(colors2);
        System.out.println("All six colors are " + colors);

        // Challenge 2 - Iterate through all elements
        for(int i = 0; i < colors.size(); i++) {
            System.out.println("The color at index " + i + " is " + colors.get(i));
        }

        //Challenge 3  Add "Red" at position 4
        colors.set(3, "red");
        System.out.println(colors);

        //Challenge 4 = Remove 3rd element
        colors.remove(2);
        System.out.println(colors);

        //Extra Challenge -> Search through & sout once found.
        for(String color: colors) {
            if (color.equalsIgnoreCase("red")){
                System.out.println("Red color found");
                break;
            } else {
                System.out.println("Still searching");
            }
        }





    }
}
