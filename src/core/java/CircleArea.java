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
public class CircleArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radius, area;
        
        System.out.print("Enter Radius : ");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius; //area of circle = πr^2
        System.out.println("Area is : "+area);
    }
    
}
