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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int numOne;
        int numTwo;
        int numThree;
        int finalNum;
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Pick a number.");
        numOne = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Pick another number.");
        numTwo = Integer.parseInt(inputScanner.nextLine());
        System.out.println("Pick one last number.");
        numThree = Integer.parseInt(inputScanner.nextLine());
        
        finalNum = numOne + numTwo + numThree;
        
        System.out.println("The sum of the numbers is:");
        System.out.println(numOne + " + " + numTwo + " + " + numThree + " = " + finalNum);
    }
}
