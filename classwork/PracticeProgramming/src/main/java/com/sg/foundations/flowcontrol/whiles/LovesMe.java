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
        
        int petalNum = 34;
        boolean isEven;
        
        if (petalNum % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        
        do
        {
            System.out.println("It loves me!");
            petalNum--;
            break;
        } while (isEven);
        
        System.out.println("It loves me NOT!");
    }
    // I'm at a loss on this one. My brain hurts.
}
