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
public class StayPositive {
    public static void main(String[] args) {
//        int max = 10;
//        int min = 0;
//        
//        System.out.println("Counting down...");
//        
//        while (min < max) {
//            System.out.println(max);
//            max--;
//        }
//        
//        System.out.println("Blast Off!");

        Scanner userInput = new Scanner(System.in);

        System.out.println("What number (#) would you like to countdown from?");
        int userNum = Integer.parseInt(userInput.nextLine());
        
        int max = userNum;
        int min = 0;
        
        System.out.println("Counting down...");
        
        while (min < max) {
            System.out.print(max + " ");
            max--;
            if (max % 10 == 0) {
                System.out.print("\n");
            }
        }
        
        System.out.println("Blast Off!");
    }
}
