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
        int willClean = randomChance.nextInt(101);
        int timesAsked = 0;
        
        do
        {
        if (isClean == false && timesAsked < 7) {
            timesAsked++;
            System.out.println("Clean your room!! (x" + timesAsked + ")");
            if (willClean <= (timesAsked*10)) {
            System.out.println("Fine! I'll clean my room. Ugh. So annoying.");
            isClean = true;
            break;
            }
        }
        } while (timesAsked < 7);
        
        if (timesAsked == 7) {
            System.out.println("That's IT, I'm doing it!! YOU'RE GROUNDED AND I'M TAKING YOUR VBUCKS TOO, PUNK!");
        }
    }
}

// o lort this tested my patience and sanity bc of the wording on the problem with the percent chance
// must make the percent willClean within a window of the percent of the times asked