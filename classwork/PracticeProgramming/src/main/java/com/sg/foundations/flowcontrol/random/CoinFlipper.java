/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Catherine
 */
public class CoinFlipper {
    public static void main(String[] args) {
    
        Random randomizer = new Random();
        
        int coinSide = randomizer.nextInt(2);
        
        System.out.println("Time to flip a coin!");
        if (coinSide == 0) {
            System.out.println("You got Heads!");
        } else {
            System.out.println("You got Tails!");
        }
        
        // Now let's write a program named CoinFlipper that simulates a
        // random coin toss, but without using nextInt().
        // Can use Math.random() ?? Not sure
    }
}
