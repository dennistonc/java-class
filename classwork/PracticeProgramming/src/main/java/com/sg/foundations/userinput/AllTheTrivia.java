/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.userinput;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        String answerOne;
        String answerTwo;
        String answerThree;
        String answerFour;
        
        Scanner userInputSc = new Scanner(System.in);
        
        System.out.println("What is the most abundant element in the Earth's atmosphere?");
        answerOne = userInputSc.nextLine();
        System.out.println("Which planet has the largest axial tilt in the solar system?");
        answerTwo = userInputSc.nextLine();
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        answerThree = userInputSc.nextLine();
        System.out.println("Name one of the planets that is made of pure rock.");
        answerFour = userInputSc.nextLine();
        
        System.out.println("\n Cool! " + answerTwo + " is the only planet that rotates clockwise in our solar system." );
        System.out.println("\n Didn't know " + answerThree + " has the largest axial tilt in the solar system." );
        System.out.println("\n It's amazing that " + answerFour + " is most abundant element in Earth's atmosphere." );
        System.out.println("\n " + answerOne + " is a planet made of pure rock." );
    }
}
