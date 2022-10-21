/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Catherine
 */
public class LovesMe {
    public static void main(String[] args) {
        
        int petalNum = 35;
        
        do
        {
        if (petalNum % 2 == 0) {
            System.out.println("It loves me!");
        } else {
            System.out.println("It loves me NOT!");
        }
        petalNum--;
        } while (petalNum > 0);

        if (petalNum % 2 == 0) {
            System.out.println("I knew it! It loves me!");
        }
    }
}
