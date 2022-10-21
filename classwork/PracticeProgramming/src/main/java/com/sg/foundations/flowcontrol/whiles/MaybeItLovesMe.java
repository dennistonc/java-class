/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Catherine
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
                
        Random randomNum = new Random();
        
        int max = 89;
        int min = 13;
        
        int petalRange = randomNum.nextInt((max - min) + min);
        int petalCount = 0;
        
        System.out.println(petalRange + " " + petalRange + " " + petalRange);
        
        boolean isEven = false;
        
        do
        { 
            petalCount++;
        if (petalCount % 2 == 0) {
            System.out.println("It loves me!");
            isEven = true;
        } else {
            System.out.println("It loves me NOT!");
            isEven = false;
        }
        } while (petalCount <= petalRange);

        if (isEven == true) {
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Awwww, bummer.");
        }
    }
}
