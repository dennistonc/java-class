/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomizer = new Random();
        
        int min = -100;
        int max = 100;
        
        int botRanNum = randomizer.nextInt(max-(min))+(min); // 0 - 99 + 1 is 100.
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println(botRanNum);
        
        System.out.println("Pick a number.");
        int userNum = Integer.parseInt(userInput.nextLine());
        
        if (userNum == botRanNum){
            System.out.println("Wow! Nice guess. That was it!");
        } 
        
        do {
        if(userNum < botRanNum) {
            System.out.println("Ha, nice try -- too low. Try again!");
            userNum = Integer.parseInt(userInput.nextLine());
        }
        if (userNum > botRanNum) {
            System.out.println("Too bad, way too high. Try again!");
            userNum = Integer.parseInt(userInput.nextLine());
        }
        } while (userNum != botRanNum);
        
        if (userNum == botRanNum){
            System.out.println("Finally! It's about time you got it!");
        }
    }
}