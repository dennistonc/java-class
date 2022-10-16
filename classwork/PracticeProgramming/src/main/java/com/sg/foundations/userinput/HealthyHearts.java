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
public class HealthyHearts {
    public static void main(String[] args) {
        // Define vars
        int userAge;
        int heartMax;
        double targetZoneLow;
        double targetZoneHigh;
                
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("What is your age?");
        userAge = Integer.parseInt(inputScanner.nextLine());
        
        heartMax = 220 - userAge;
        targetZoneLow = (.50 * heartMax);
        targetZoneHigh = (.85 * heartMax);
        
        System.out.println("Your maximum heart rate should be " + heartMax + " beats per minute.");
        
        System.out.println("Your target heart rate zone is " + targetZoneLow + "-" + targetZoneHigh + " beats per minute.");
    }
}
