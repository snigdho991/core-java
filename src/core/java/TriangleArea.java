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
public class TriangleArea {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, height, area;
        
        System.out.print("Enter Base : ");
        base = input.nextDouble();
        
        System.out.print("Enter Height : ");
        height = input.nextDouble();
        
        area = 0.5 * base * height; //area of triangle = 0.5 * base * height
        
        System.out.println("Area is : "+area);
        
    }
    
}
