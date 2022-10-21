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
public class LazyTeenager {
    public static void main(String[] args) {
        
        Random randomChance = new Random();
        
        boolean isClean = false;
        int chanceOfClean = randomChance.nextInt(100);
        int timesAsked = 0;
        
//        do
//        {
        if (isClean == false && timesAsked < 7) {
            System.out.println("Clean your room!!");
            timesAsked++;
            if (chanceOfClean > 50) {
            System.out.println("Fine! I'll clean my room. Ugh. So annoying.");
            isClean = true;
//            break;
            }
        }
//        } while (timesAsked < 7);
        
        if (timesAsked == 7) {
            System.out.println("That's IT, I'm doing it!! YOU'RE GROUNDED AND I'M TAKING YOUR VBUCKS TOO, PUNK!");
        }
    }
}

// will be revisiting this problem...

