/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class RollerCoaster {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");

//        String keepRiding = "y";
//        int loopsLooped = 0;
//        
//        while (keepRiding.equals("y")) {
//            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
//            System.out.println("Want to keep going? (y/n) :");
//            keepRiding = userInput.nextLine();
//            loopsLooped++;
//        }

        String stopRiding = "n";
        int loopsLooped = 0;
        
        while (stopRiding.equals("n")) {
            System.out.println("Want to keep going? (y/n) :");
            stopRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
        
        // What happens if the user enters a value that is neither "y" nor "n"?
        // (Make a guess first, and then test to see if your guess was right.)
        // It loops.
        
        // What happens if we change the condition to check for a no answer instead?
        // (To do this, comment out the old condition, and write a new one!)
        // Stops after 1 loop? Idt that's right, but my brain broken rn.
        
    }
}
