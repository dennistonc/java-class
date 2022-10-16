/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Catherine
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        // Declare everything (best done at beginning of program)
        int butterflies, beetles, bugs;
        // Best practice is line by line but for brevity, using one line
        
        // Assign values
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math after all...");
        
        // Why does the number of bugs not change when we change the number of butterflies? (Answer in a comment.)
        // Only subtracts from butterflies and doesn't do the math for bugs, it's only concatenated.
    }
}
