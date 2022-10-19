/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Catherine
 */

// store integer in var
// ask user to pick number
// use scanner and nextline
// print if their number is =, <, or > (display ur num too)
// use switch?

// how to add an ask again feature in if-else statements and loop again after getting user input?

import java.util.Scanner;

public class GuessMe {
//    static void askAgain() {
//        int userNum = 0;
//        
//        Scanner userInput = new Scanner(System.in);
//        
//        System.out.println("Invalid number. Please pick between 1-50.");
//        userNum = Integer.parseInt(userInput.nextLine());
//    }
    
    public static void main(String[] args) {
        int myNum = 13;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("I've chosen a number between 1 and 50. Bet you can't guess it!");
        
        System.out.println("Pick a number.");
        int userNum = Integer.parseInt(userInput.nextLine());
        
        if (myNum == userNum){
            System.out.println("Wow! Nice guess. That was it!");
        } if (myNum > userNum) {
            System.out.println("Ha, nice try -- too low. I chose " + myNum);
        } if (myNum < userNum) {
            System.out.println("Too bad, way too high. I chose " + myNum);
        }
    }
}
        
//        if (userNum > 50) {
//            System.out.println("Invalid number. Please pick between 1-50.");
//            userNum = Integer.parseInt(userInput.nextLine());
//        } else if (userNum < 1) {
//            System.out.println("Invalid number. Please pick between 1-50.");
//            userNum = Integer.parseInt(userInput.nextLine());
//        } else if (myNum == userNum){
//            System.out.println("Wow! Nice guess. That was it!");
//        } else if (myNum > userNum) {
//            System.out.println("Ha, nice try -- too low. I chose " + myNum + ". Try again?");
//            userNum = Integer.parseInt(userInput.nextLine());
//        } else if (myNum < userNum) {
//            System.out.println("Too bad, way too high. I chose " + myNum + ". Try again?");
//            userNum = Integer.parseInt(userInput.nextLine());
//        }
//    }
//}
