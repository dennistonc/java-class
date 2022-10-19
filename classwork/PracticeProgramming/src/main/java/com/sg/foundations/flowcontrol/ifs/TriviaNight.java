/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Catherine
 */
public class TriviaNight {
    public static void main(String[] args) {
        int answerBank = 0;
        
    Scanner userInput = new Scanner(System.in);
        
        System.out.println("Get ready for some trivia!\n");
        System.out.println("Q1");
        System.out.println("What color do red and blue make?");
        System.out.println("1) Green        2) Orange");
        System.out.println("3) Purple       4) Chartreuse");
        int answerOne = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Q2");
        System.out.println("Which of these clefs does NOT exist?");
        System.out.println("1) Bass        2) Tenor");
        System.out.println("3) Suramar       4) Treble");
        int answerTwo = Integer.parseInt(userInput.nextLine());
                
        System.out.println("Q3");
        System.out.println("What is a praying mantis?");
        System.out.println("1) Insect        2) Reptile");
        System.out.println("3) Mammal       4) Amphibian");
        int answerThree = Integer.parseInt(userInput.nextLine());
        
        if (answerOne == 3) {
            answerBank++;
        }
        if (answerTwo == 3) {
            answerBank++;
        }
        if (answerThree == 1) {
            answerBank++;
        }
        if (answerBank == 0) {
            System.out.println("So sorry.");
        } else if (answerBank == 1) {
            System.out.println("That's alright. You'll get 'em next time.");
        } else if (answerBank == 2) {
            System.out.println("Hey, not bad!");
        } else if (answerBank == 3) {
            System.out.println("Perfect score!");
        }
                
        System.out.println("You got " + answerBank + " correct.");
    }
}
