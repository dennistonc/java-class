/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Catherine
 */
public class AllAboutMe {
    public static void main(String[] args) {
        // define vars
        String myName;
        String favFood;
        int numberPets;
        String whereYaLive;
        boolean learnedToWhistle;
        
        // input data to vars
        myName = "Catherine";
        favFood = "too much to write down";
        numberPets = 0;
        whereYaLive = "apartment";
        learnedToWhistle = true;
        
        System.out.println("My name is " + myName + ".");
        System.out.println("My favorite food is " + favFood + ".");
        System.out.println("I have " + numberPets + " pets.");
        System.out.println("I live in a/an " + whereYaLive + ".");
        System.out.println("It is " + learnedToWhistle + " I learned how to whistle.");
    }
}
