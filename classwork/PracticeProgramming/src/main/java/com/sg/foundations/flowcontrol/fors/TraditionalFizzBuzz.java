/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int totalFB = 0;
        
        System.out.println("How many units of fizzing and buzzing do you need in your life? ");
        int numUnits = Integer.parseInt(userInput.nextLine());
        
        for (int i = 1; totalFB < numUnits; i++) {
            if (i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
                totalFB++;
            } else if (i%3 == 0) {
                System.out.println("Fizz");
                totalFB++;
            } else if (i%5 == 0) {
                System.out.println("Buzz");
                totalFB++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Tradition!!");
    }
}
