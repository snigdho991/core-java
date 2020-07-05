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
public class DataTypes {
    
    public static void main(String[] args) {
        boolean b;
        byte c;
        float d;
        
        b = true;
        c = -100;
        d = 10.254455522125552f;
        
        System.out.println("b = "+b+"\nc = "+c);
        
        //Format Specifier
        
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("byte c = %d\n", c);
        System.out.printf("Float d = %.2f\n", d);
    }
    
}
