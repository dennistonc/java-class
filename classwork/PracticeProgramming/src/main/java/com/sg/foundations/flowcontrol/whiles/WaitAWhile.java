/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Catherine
 */
public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 11;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
        
        // What about using bedTime's original value, but changing timeNow to 11?
        // It's past bedtime so straight to bed we go.
        // If you comment out timeNow++ at the end of the loop, what happens?
        // Loops forever and ever.
    }
}
