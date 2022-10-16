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
public class MiniMadLibs {
    public static void main(String[] args) {
        String nounOne;
        String adjOne;
        String nounTwo;
        int numOne;
        String adjTwo;
        String plNounOne;
        String plNounTwo;
        String plNounThree;
        String verbOne;
        String verbTwo;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Wanna play a GAME? (Of Mad Libs Of Course!) :) \n");
        System.out.println("Please provide a noun: ");
        nounOne = inputScanner.nextLine();
        System.out.println("Please provide an adjective: ");
        adjOne = inputScanner.nextLine();
        System.out.println("Please provide another noun: ");
        nounTwo = inputScanner.nextLine();
        System.out.println("Please provide a number: ");
        numOne = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Please provide another adjective: ");
        adjTwo = inputScanner.nextLine();
        System.out.println("Please provide a plural noun: ");
        plNounOne = inputScanner.nextLine();
        System.out.println("Please provide another plural noun: ");
        plNounTwo = inputScanner.nextLine();
        System.out.println("Please provide a third plural noun: ");
        plNounThree = inputScanner.nextLine();
        System.out.println("Please provide a verb: ");
        verbOne = inputScanner.nextLine();
        System.out.println("Please provide the same verb in past tense: ");
        verbTwo = inputScanner.nextLine();
        
        System.out.println("\n Story time!");
        System.out.println("\n" + nounOne + " the " + adjOne + " frontier. These are the voyages of the starship " + nounTwo + ". Its " + numOne + "-year mission: to explore strange " + adjTwo + " " + plNounOne + ", to seek out " + adjTwo + " " + plNounTwo + " and " + adjTwo + " " + plNounThree + ", to boldly " + verbOne + " where no one has " + verbTwo + " before.");
    }
}
