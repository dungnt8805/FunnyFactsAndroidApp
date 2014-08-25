package com.kaptanas.funnyfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by cnkaptan on 08/31/14.
 */
public class ColorWheel {

    // Member variable (properties about the object)
    Random randomGenerator = new Random();  // Construct a new Random number generator
    char[] hexCodes ={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    // Method (abilities: things the object can do)
    public int getColor() {

        String color = "#";

        for (int i = 0; i < 6 ; i++) {
            color+=hexCodes[randomGenerator.nextInt(hexCodes.length)];
        }
        // convert from String hexcode of Color to int
        // hexcode şeklindeki renk kodunu int'e çevirme
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
