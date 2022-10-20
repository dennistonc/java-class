/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class HighRoller {
    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner userInput = new Scanner(System.in);

//        int rollResult = ((diceRoller.nextInt(6)) + 1);
//
//        System.out.println("TIME TO ROOOOOOLL THE DICE!");
//        System.out.println("I rolled a " + rollResult);
//
//        if (rollResult == 1) {
//            System.out.println("You rolled a critical failure!");
//        }

        System.out.println("Please provide how many sides (#) a single dice has.");
        int diceSides = Integer.parseInt(userInput.nextLine());
        int rollResult = ((diceRoller.nextInt(diceSides)) + 1);
        
        System.out.println("You rolled a " + rollResult);
        
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        if (rollResult == diceSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
