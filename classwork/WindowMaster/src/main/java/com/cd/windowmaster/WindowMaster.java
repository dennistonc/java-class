/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cd.windowmaster;

/**
 *
 * @author Catherine
 */

/* It must prompt the user for the height of the window (in feet).
   It must prompt the user for the width of the window (in feet).
   It must calculate and display the area of the window.
   It must calculate and display the perimeter of the window.
   Based on the area and perimeter, it must calculate the total cost of the window.
       The glass for the windows cost $3.50 per square foot.
       The trim for the windows cost $2.25 per linear foot.

   Psuedocode
   need Scanner, so import it
   prompt user using System.out for window height (float)
   prompt user for window width (float)
   make sure to set the variables able to receive the inputs as well
       string height and width then remember to parse later to FLOAT
   use scanner
   do math
   p = add all sides (* 2.25) (float)
   a = h x w (* 3.50) (float)
   find the total cost (sum) (float)
*/
//import java.util.Scanner;
//
//public class WindowMaster {
//    public static void main(String[] args) {
//        // 1) declare var for height and width
//        float height;
//        float width;
//
//        // declare String var to hold user input h and w
//        String stringHeight;
//        String stringWidth;
//
//        // declare other vars
//        float areaOfWindow;
//        float cost;
//        float perimeterOfWindow;
//
//        // 2) declare and init Scanner
//        Scanner myScanner = new Scanner(System.in);
//
//        // get input from the user
//        System.out.println("Please enter window height:");
//        stringHeight = myScanner.nextLine();
//        System.out.println("Please enter window width:");
//        stringWidth = myScanner.nextLine();
//        
//        // 3) convert String values of height and width to float values
//        height = Float.parseFloat(stringHeight);
//        width = Float.parseFloat(stringWidth);
//        
//        // 4) calculate the area of the window
//        areaOfWindow = height * width;
//        
//        // calculate the perimeter of the window
//        perimeterOfWindow = 2 * (height + width);
//        
//        // 5) calculate the total cost
//        // this example is using a hard-coded value for material cost instead of var
//        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
//        
//        // 6) display the results to the user
//        System.out.println("Window height = " + stringHeight);
//        System.out.println("Window width = " + stringWidth);
//        System.out.println("Window area = " + areaOfWindow);
//        System.out.println("Window perimeter = " + perimeterOfWindow);
//        System.out.println("Total Cost = " + cost);
//    }
//}

// On Your Own
// Refactor the code to include user input prompts for the cost of the window
// and trim, instead of using the hard-coded values that we used in the example.
import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        // 1) declare var for height and width
        float height;
        float width;
        float glassCost;
        float trimCost;

        // declare String var to hold user input h and w
        String stringHeight;
        String stringWidth;
        String stringGlassCost;
        String stringTrimCost;

        // declare other vars
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // 2) declare and init Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter the cost of glass per square foot:");
        stringGlassCost = myScanner.nextLine();
        System.out.println("Please enter the cost of trim per linear foot:");
        stringTrimCost = myScanner.nextLine();
        
        // 3) convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        glassCost = Float.parseFloat(stringGlassCost);
        trimCost = Float.parseFloat(stringTrimCost);
        
        // 4) calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // 5) calculate the total cost
        // this example is using a hard-coded value for material cost instead of var
        cost = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        
        // 6) display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}

// Refactor the code to prompt the user to enter the number of windows in addition to the height and width.
// Update the cost calculations to include the number of windows.
// Assume that all windows are the same size for this exercise.

// Refactor the code to include a try/catch validation on the user input,
// using the pattern provided in the lesson on collecting console input.
// When refactoring multiple parts of the code to do the same thing, it's
// often best to refactor ONE of the parts first to make sure it works as expected.
// Once you understand what the pattern is doing, it's easier to reuse it in other parts of the code.