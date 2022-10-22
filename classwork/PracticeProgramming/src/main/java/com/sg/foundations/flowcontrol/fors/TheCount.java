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
public class TheCount {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int startVal = 0;
        int endVal = 0;
        int incrementVal = 0;
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.println("Start at: ");
        startVal = Integer.parseInt(userInput.nextLine());
        System.out.println("Stop at: ");
        endVal = Integer.parseInt(userInput.nextLine());
        System.out.println("Count by: ");
        incrementVal = Integer.parseInt(userInput.nextLine());
        
        for (int i = startVal; i < endVal; i+=incrementVal) {
            System.out.println(i);
        }
    }
}
