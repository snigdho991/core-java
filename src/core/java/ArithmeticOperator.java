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
public class ArithmeticOperator {
    
    public static void main(String[] args) {
        //Scanner object
        Scanner input = new Scanner(System.in);
        //Variable declaring
        int num1, num2, result;
        //Taking input from user
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        
        //Printing the result
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1-num2;
        System.out.println("Sub = " +result);
        
        double result2 = (double) num1 / num2;
        System.out.println("Div = "+result2);
        
        result = num1 % num2;
        System.out.println("Reminder = "+result);
        
        //Assignment Operator ('=' Assign operator, not equal)
        //x += 5, x = x + 5; x /= 5, x = x / 5; x %= 5, x = x % 5;
        
    }
    
}
