/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Catherine
 */
public class SimpleCombination {
    public static void main(String args[]) {
      int[] firstHalf = { 3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49 };
      int[] secondHalf = { 51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100 };
      int[] wholeNumbers = new int[24];

    // combine code
    System.out.println("All together now!:");
    
    for (int i = 0; i < wholeNumbers.length; i++) { // loop through 24
//        for (int j = 0; j < firstHalf.length; j++) { // loop through 12 in first array
            if (i < firstHalf.length) {
                System.out.print(firstHalf[i] + " ");
            }
//        }
//        for (int k = 0; k < secondHalf.length; k++) { // loop through 12 in second array
            if (i >= firstHalf.length) {
                System.out.print(secondHalf[i-firstHalf.length] + " ");
            }
    }
    
    // print code
    }
}
