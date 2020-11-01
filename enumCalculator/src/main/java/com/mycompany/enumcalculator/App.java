package com.mycompany.enumcalculator;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Calculate operation = new Calculate();
        
        System.out.println("Enter a number");
        int num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter anoter number");
        int num2 = Integer.parseInt(input.nextLine());
        
        operation.run(num1, num2);
    }
}
