/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class BewareTheKraken {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        boolean backToSurface = false;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200 && backToSurface == false) {
            depthDivedInFt += 1000;
            
            System.out.println("So far, we've descended " + depthDivedInFt + " feet");

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            System.out.println("Do you want to stop? (y/n) ");
            String yesOrNo = userInput.nextLine();
            if (yesOrNo.equals("y")) {
                backToSurface = true;
                System.out.println("Back to the surface we go!");
                break;
            }
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}
