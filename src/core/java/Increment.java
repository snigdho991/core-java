/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.java;

/**
 *
 * @author singdho
 */
public class Increment {
    
    public static void main(String[] args) {
        int x = 50;
        int y;
        
        //Postfix Increment
//        y = x++;
//        System.out.println("y = "+y);
//        
//        y = x;
//        System.out.println("y = "+y);
        
        //prefix increment
        y = ++x;
        System.out.println("y = "+y);
        
        y = x;
        System.out.println("y = "+y);
    }
    
}
