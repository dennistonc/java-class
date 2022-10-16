/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.userinput;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class DoItBetter {
    public static void main(String[] args) {
        // Define vars
        int userMiles;
        int hotdog;
        int langKnown;
                
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Just wondering... How many miles can you run?");
        userMiles = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Oh... That's cute. I can run " + ((2 * userMiles) + 1) + ".\n");
        
        System.out.println("What about hot dogs? How many can you eat?");
        hotdog = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Interesting... I can eat " + ((2 * hotdog) + 1) + ".\n");
        
        System.out.println("And languages? How many do you know?");
        langKnown = Integer.parseInt(inputScanner.nextLine());
        System.out.println("I see. I know " + ((2 * langKnown) + 1) + ".\n");
    }
}
