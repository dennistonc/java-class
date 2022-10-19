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
public class BirthStones {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Choose a month and I'll tell you what the birthstone for it is. (Must be a number value.)");
        int userNum = Integer.parseInt(userInput.nextLine());
        
        if (userNum == 1) {
            System.out.println("January's birthstone is Garnet.");
        } else if (userNum == 2) {
            System.out.println("February's birthstone is Amethyst.");
        } else if (userNum == 3) {
            System.out.println("March's birthstone is Aquamarine.");
        } else if (userNum == 4) {
            System.out.println("April's birthstone is Diamond.");
        } else if (userNum == 5) {
            System.out.println("May's birthstone is Emerald.");
        } else if (userNum == 6) {
            System.out.println("June's birthstone is Pearl.");
        } else if (userNum == 7) {
            System.out.println("July's birthstone is Ruby.");
        } else if (userNum == 8) {
            System.out.println("August's birthstone is Peridot.");
        } else if (userNum == 9) {
            System.out.println("September's birthstone is Sapphire.");
        } else if (userNum == 10) {
            System.out.println("October's birthstone is Opal.");
        } else if (userNum == 11) {
            System.out.println("November's birthstone is Topaz.");
        } else if (userNum == 12) {
            System.out.println("December's birthstone is Turquoise.");
        } else {
            System.out.println("That month doesn't exist.");
        }
    }
}
//        switch (userNum) {
//            case "January":
//                System.out.println("January's birthstone is Garnet.");
//                break;
//            case 2:
//                System.out.println("February's birthstone is Amethyst.");
//                break;
//            case 3:
//                System.out.println("March's birthstone is Aquamarine.");
//                break;
//            case 4:
//                System.out.println("April's birthstone is Diamond.");
//                break;
//            case 5:
//                System.out.println("May's birthstone is Emerald.");
//                break;
//            case 6:
//                System.out.println("June's birthstone is Pearl.");
//                break;
//            case 7:
//                System.out.println("July's birthstone is Ruby.");
//                break;
//            case 8:
//                System.out.println("August's birthstone is Peridot.");
//                break;
//            case 9:
//                System.out.println("September's birthstone is Sapphire.");
//                break;
//            case 10:
//                System.out.println("October's birthstone is Opal.");
//                break;
//            case 11:
//                System.out.println("November's birthstone is Topaz.");
//                break;
//            case 12:
//                System.out.println("December's birthstone is Turquoise.");
//                break;
//            default:
//                System.out.println("That month doesn't exist.");
//                break;
//        }
//}
