/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 *
 * @author Catherine
 */
public class FruitSalad {
    public static void main(String args[]) {
        String[] fruit = { "Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry" };
        
        String[] fruitSalad = new String[12];

    // all berries -- 5
    // <= 3 apples -- 3
    // <= 2 orange types -- 2
    // no tomatoes -- 0
    // <= 12 diff kinds of fruit -- 2 extra other fruit
    // print total NUMBER and TYPES of fruit in the fruit salad
        // this mean element and indices used ......... but how
    
    // code recipe for fruit salad should go here
            // (String fruit1 : fruit) {
            // ^^^ this is an enhanced for loop
            // temporary variable "fruit1" is being made to stand in place of each element in the fruit array
            // so inside the for loop, you can compare each element in the array as thought it was called fruit1
            // useful for traversing arrays
        for (int i = 0; i < fruit.length; i++) { // loop through all the fruits, 24 of them
            int berryTypes = 0;
            int appleTypes = 0;
            int orangeTypes = 0;
            int tomatoTypes = 0;
            int otherTypes = 0;
            
            if (fruit[i].contains("berry")) {
                berryTypes++;
                System.out.println(fruit[i]);
//                System.out.println(berryTypes);
            } else if (fruit[i].contains("Apple")) {
                appleTypes++;
                System.out.println(fruit[i]);
    //            System.out.println(appleTypes);
            } else if (fruit[i].contains("Orange")) {
                orangeTypes++;
                System.out.println(fruit[i]);
    //            System.out.println(orangeTypes);
            } else if (fruit[i].contains("Tomato")) {
                tomatoTypes++;
                System.out.println(fruit[i]);
    //            System.out.println(tomatoTypes);
            } else {
                otherTypes++;
                System.out.println(fruit[i]);
    //            System.out.println(otherTypes);
            }
//            for (int f = 0; f <= fruit.length; f++) { // loop through
//            fruitSalad[f] = fruit[f];
//            System.out.println("\n" + fruitSalad[i]);
//            }
        }        
     
    // print code
    //   System.out.println("All together now!:");
    //   System.out.println(wholeNumbers);
        }
    }
