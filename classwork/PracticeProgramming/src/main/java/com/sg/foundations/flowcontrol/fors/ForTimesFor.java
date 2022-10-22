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
public class ForTimesFor {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int numChoice = 0;
        int userAnswer = 0;
        int correctAnswer = 0;
        
        System.out.println("Which times table shall I recite?");
        numChoice = Integer.parseInt(userInput.nextLine());
        
        for (int i = 1; i <16; i++) {
            System.out.println(i + "*" + numChoice + " is?: ");
            userAnswer = Integer.parseInt(userInput.nextLine());
            if (userAnswer == (i*numChoice)) {
                System.out.println("Correct!");
                correctAnswer++;
            } else {
                System.out.println("Sorry no, the answer is: " + (i*numChoice));
            }
        }
        
        System.out.println("You got " + correctAnswer + " correct.");
    }
}
