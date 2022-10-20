/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Catherine
 */
public class FortuneCookie {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        int y = randomizer.nextInt(11);
        
        System.out.println("Your Disney Fortune:");
        
        switch(y) {
            case 0:
                System.out.println("OHANA MEANS FAMILY. FAMILY MEANS NOBODY GETS LEFT BEHIND. – LILO & STITCH.");
                break;
            case 1:
                System.out.println("IN EVERY JOB THAT MUST BE DONE, THERE IS AN ELEMENT OF FUN. – MARY POPPINS.");
                break;
            case 2:
                System.out.println("THE PAST CAN HURT, BUT THE WAY I SEE IT YOU CAN EITHER RUN FROM IT OR LEARN FROM IT. – RAFIKI, THE LION KING.");
                break;
            case 3:
                System.out.println("IF YOU DO YOUR BEST EACH AND EVERY DAY, GOOD THINGS ARE SURE TO COME YOUR WAY. – PRINCESS TIANA, THE PRINCESS AND THE FROG.");
                break;
            case 4:
                System.out.println("REMEMBER YOU'RE THE ONE WHO CAN FILL THE WORLD WITH SUNSHINE. – SNOW WHITE AND THE SEVEN DWARVES.");
                break;
            case 5:
                System.out.println("WHEN YOU’RE THE BEST OF FRIENDS HAVING SO MUCH FUN TOGETHER, YOU’RE NOT EVEN AWARE YOU’RE SUCH A FUNNY PAIR. – THE FOX AND THE HOUND.");
                break;
            case 6:
                System.out.println("SOMETIMES THE RIGHT PATH IS NOT THE EASIEST ONE. - GRANDMOTHER WILLOW, POCAHONTAS.");
                break;
            case 7:
                System.out.println("IF YOU FOCUS ON WHAT YOU LEFT BEHIND, YOU WILL NEVER SEE WHAT LIES AHEAD. – GUSTEAU, RATATOUILLE.");
                break;
            case 8:
                System.out.println("THE FLOWER THAT BLOOMS IN ADVERSITY IS THE MOST RARE AND BEAUTIFUL OF THEM ALL. - MULAN.");
                break;
            case 9:
                System.out.println("GETCHA HEAD IN THE GAME - TROY BOLTON, HIGH SCHOOL MUSICAL.");
                break;
            case 10:
                System.out.println("SOMETIMES OUR STRENGTHS LIE BENEATH THE SURFACE... FAR BENEATH, IN SOME CASES. - MOANA.");
                break;
        }
    }
}
