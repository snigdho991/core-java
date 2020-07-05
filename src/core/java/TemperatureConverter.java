/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.java;

import java.util.Scanner;

/**
 *
 * @author singdho
 */
public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double cels, farn;
        System.out.print("Temperature in Celcius : ");        
        cels = input.nextDouble();
        
        farn = 1.8 * cels + 32;
        System.out.println("Temperature in Farenheit : "+farn);
        
    }
    
}
