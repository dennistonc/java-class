/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.userinput;

/**
 *
 * @author Catherine
 */
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        // Define vars
        String userName;
        String botName;
        String userColor;
        String botColor;
        String userFood;
        String botFood;
        int botNum;
        
        botName = "CatBot";
        botColor = "gray";
        botFood = "nuts and bolts";
        botNum = 13;
        
        Scanner inputScanner = new Scanner(System.in);
        //Ask the user for their name.
        System.out.println("Hi! What's your name?");
        userName = inputScanner.nextLine();
        //Display that name and tell them yours (or your AI's name!).
        System.out.print("What a nice name, " + userName + ".");
        System.out.println("I'm " + botName + ".\n");
        //Ask them for their favorite color.
        System.out.println("What's your favorite color?");
        userColor = inputScanner.nextLine();
        //Display the color they enter in a conversational way.
        System.out.println(userColor + " is such a pleasant color. My favorite is " + botColor + ".\n");
        //Do the same thing with favorite food and number, and then say goodbye!
        System.out.println("How about any favorite numbers?");
        int userNum = Integer.parseInt(inputScanner.nextLine());
        System.out.println(userNum + " is good, but personally I like " + Integer.toString(botNum) + ".");
        //Make sure you use the right variable with the right user input!
    }
}
