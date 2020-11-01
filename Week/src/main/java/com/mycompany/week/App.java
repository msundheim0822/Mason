/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week;

import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class App {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        DaysOfTheWeek week = new DaysOfTheWeek();
    
        System.out.println("Enter a day of the week");
        String day = input.nextLine();
        
        week.find(day);
    }
}
