/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enumcalculator;

import static com.mycompany.enumcalculator.Calculate.MathOperator.DIVIDE;
import static com.mycompany.enumcalculator.Calculate.MathOperator.MINUS;
import static com.mycompany.enumcalculator.Calculate.MathOperator.MULTIPLY;
import static com.mycompany.enumcalculator.Calculate.MathOperator.PLUS;

/**
 *
 * @author Mason
 */
public class Calculate {
    
    public void run(int num1, int num2) {
        System.out.println(calculate(PLUS, num1, num2));
        System.out.println(calculate(MINUS, num1, num2));
        System.out.println(calculate(MULTIPLY, num1, num2));
        System.out.println(calculate(DIVIDE, num1, num2));
    }
    
   public int calculate(MathOperator operator, int operand1, int operand2) {
         switch(operator) {
                case PLUS:
                      return operand1 + operand2;
                case MINUS:
                      return operand1 - operand2;
                case MULTIPLY:
                      return operand1 * operand2;
                case DIVIDE:
                      return operand1 / operand2;
                default:
                      throw new UnsupportedOperationException();
         }
   }
   
   public enum MathOperator {
    PLUS, MINUS, MULTIPLY, DIVIDE
    }
}
