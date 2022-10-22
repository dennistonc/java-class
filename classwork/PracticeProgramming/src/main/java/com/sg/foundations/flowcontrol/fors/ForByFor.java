/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Catherine
 */
public class ForByFor {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            // prints first column of | down

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j == 1 && (i == 0 || i == 2)) {
                        System.out.print("$");
                    } else if (i == 1 && (j == 0 || j == 2)) {
                        System.out.print("@");
                    } else if (j == 1 && i == 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("*");
                    // prints all the stars between |   |
                    }
                }
                System.out.print("|");
                // prints the | every 3 between the stars
            }
            System.out.println("");
            // new row
        }
    }
}
