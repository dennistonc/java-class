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
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if ((action.equals("open the mailbox")) || (action.contains("open"))) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if ((action.equals("look inside")) || (action.contains("look"))) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if ((action.equals("keep looking")) || (action.contains("keep"))){
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a Grue.");
                } else if ((action.equals("run away")) || (action.contains("run"))) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if ((action.equals("stick your hand in")) || (action.contains("stick"))) { 
                System.out.println("CHOMP.");
                System.out.println("No more hand and you bleed out and die on this hill... Or field.");
            }
        } else if ((action.equals("go to the house")) || (action.contains("house"))) { 
            System.out.println("You walk to the house.");
            System.out.println("You figure you can squeeze through the boarded up door.");
            System.out.println("Do you decide to squeeze past the boarded up door?");
            action = userInput.nextLine();
            
            if ((action.equals("no")) || (action.contains("n"))) {
                System.out.println("You turn around to see a giant Cyclops with a big toothy grin.");
                System.out.println("But not for long. CHOMP. He eats you. You die. :( ");
            } else if ((action.equals("yes")) || (action.contains("y"))){
                System.out.println("Your curiousity has been rewarded.");
                System.out.println("The inside is FULL of gems and gold piled as high as the eye can see.");
                System.out.println("Should you ransack the place or explore more with caution?");
                action = userInput.nextLine();

                if ((action.equals("ransack the place")) || (action.contains("ransack"))){
                    System.out.println("The treasure dissolves into sand upon your touch.");
                    System.out.println("It was all fake! Under a deceptive spell.");
                    System.out.println("You hear an evil cackle within the shadows and suddenly your vision goes black.");
                } else if ((action.equals("explore more with caution")) || (action.contains("explore"))) {
                    System.out.println("You run into a beautiful fairy, clad in shimmering pinks and holographic blues.");
                    System.out.println("She rewards your honesty and integrity for not touching the treasure.");
                    System.out.println("You leave with SO MUCH TREASURE!!! Safe and sound under her watch. :) ");
                }
            }
        }
    }
}
