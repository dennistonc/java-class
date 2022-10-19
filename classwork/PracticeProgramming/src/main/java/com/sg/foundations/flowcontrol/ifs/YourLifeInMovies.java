/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ayo, what year were you born? YYYY");
        int userYear = Integer.parseInt(userInput.nextLine());

        if (userYear < 2005){
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        } if (userYear < 1995) {
            System.out.println("And the first Harry Potter came out over 15 years ago.");
        } if (userYear < 1985) {
            System.out.println("AND Space Jam came out not last decade, but the one before THAT.");
        } if (userYear < 1975) {
            System.out.println("Also, the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        } if (userYear < 1965) {
            System.out.println("Lastly, the MASH TV series has been around for almost half a century!");
        }
    }
}
