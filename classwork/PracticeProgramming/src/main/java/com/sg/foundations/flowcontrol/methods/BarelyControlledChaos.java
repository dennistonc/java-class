/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Catherine
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = favColor(); // call color method here
        String animal = favAnimal(); // call animal method again here
        String colorAgain = favColor(); // call color method again here
        int weight = animalWeight(); // call number method,
            // with a range between 5 - 200
        int distance = longDistance(); // call number method,
            // with a range between 10 - 20
        int number = countPoppies(); // call number method,
            // with a range between 10000 - 20000
        int time = countHours(); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    public static String favColor(){
        Random randomizer = new Random();
        String colorOne = "blue";
        String colorTwo = "teal";
        String colorThree = "gray";
        String colorFour = "white";
        String colorFive = "chartruese";
        
        int colorNumber = randomizer.nextInt(5)+1; 
        
        // practice without switch statement
        if (colorNumber == 1) {
            return colorOne;
        } else if (colorNumber == 2) {
            return colorTwo;
        } else if (colorNumber == 3) {
            return colorThree;
        } else if (colorNumber == 4) {
            return colorFour;
        } else if (colorNumber == 5) {
            return colorFive;
        }
        return favColor();
    }
    
    public static String favAnimal(){
        Random randomizer = new Random();
        String animalOne = "wolf";
        String animalTwo = "cat";
        String animalThree = "seal";
        String animalFour = "okapi";
        String animalFive = "panda";
        
        int animalNumber = randomizer.nextInt(5)+1; 
        
        // practice with switch statement
        switch (animalNumber) {
            case 1:
                return animalOne;
            case 2:
                return animalTwo;
            case 3:
                return animalThree;
            case 4:
                return animalFour;
            case 5:
                return animalFive;
            default:
                break;
        }
        return favAnimal();
    }
    
    public static String ColorAgain(){
        return favColor();
    }
    
    public static int animalWeight(){
        Random randomizer = new Random();
        int min = 5;
        int max = 200;
        int randomWeight = randomizer.nextInt(max-(min)+min);
        
        return (randomWeight);
    }
    public static int longDistance(){
        Random randomizer = new Random();
        int min = 10;
        int max = 20;
        int randomDistance = randomizer.nextInt(max-(min)+min);
        
        return (randomDistance);
    }
    public static int countPoppies(){
        Random randomizer = new Random();
        int min = 10000;
        int max = 20000;
        int randomNumber = randomizer.nextInt(max-(min)+min);
        
        return (randomNumber);
    }
    public static int countHours(){
        Random randomizer = new Random();
        int min = 2;
        int max = 6;
        int randomHours = randomizer.nextInt(max-(min)+min);
        
        return (randomHours);
    }
}
