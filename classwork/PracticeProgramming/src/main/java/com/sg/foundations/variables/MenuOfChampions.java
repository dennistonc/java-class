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
public class MenuOfChampions {
    public static void main(String[] args) {
        String foodOne;
        String foodTwo;
        String foodThree;
        double priceOne;
        double priceTwo;
        double priceThree;
        
        foodOne = "Sinigang";
        foodTwo = "Chicken Adobo";
        foodThree = "Pork Skewer";
        priceOne = 6.50;
        priceTwo = 12;
        priceThree = 1.50;
        
        System.out.println(".-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.");
        System.out.println();
        System.out.println("Welcome to Gina's Filipina Food");
        System.out.println();
        System.out.println(".-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.     .-\"-.");
        System.out.println();
        System.out.println(foodOne + " *** " + "$" + priceOne);
        System.out.println(foodTwo + " *** " + "$" + priceTwo);
        System.out.println(foodThree + " *** " + "$" + priceThree);
    }
}
