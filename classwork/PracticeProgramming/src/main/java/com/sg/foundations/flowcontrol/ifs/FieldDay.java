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

//  For example, it should take a last name as input and use that to output the team name.

public class FieldDay {
    public static void main(String[] args) {
        String lastName = "";
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to the Field Day! What's your last name?");
        lastName = userInput.nextLine();
        
        if ((lastName.compareTo("Baggins")) <= 0) {
            System.out.println("You're on the team 'Red Dragons'!\n Good luck and enjoy the games!");
        } else if (((lastName.compareTo("Baggins")) >= 0) && (lastName.compareTo("Dresden")) <=0) {
            System.out.println("You're on the team 'Dark Wizards'!\n Good luck and enjoy the games!");
        } else if (((lastName.compareTo("Dresden")) >= 0) && (lastName.compareTo("Howl")) <=0) {
            System.out.println("You're on the team 'Moving Castles'!\n Good luck and enjoy the games!");
        } else if (((lastName.compareTo("Howl")) >= 0) && (lastName.compareTo("Potter")) <=0) {
            System.out.println("You're on the team 'Golden Snitches'!\n Good luck and enjoy the games!");
        } else if (((lastName.compareTo("Potter")) >= 0) && (lastName.compareTo("Vimes")) <=0) {
            System.out.println("You're on the team 'Night Guards'!\n Good luck and enjoy the games!");
        } else if ((lastName.compareTo("Vimes")) >= 0) {
            System.out.println("You're on the team 'Black Holes'!\n Good luck and enjoy the games!");
        }
    }
}
