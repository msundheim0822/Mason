import java.util.*;
public class App
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        simpleCalculator calc = new simpleCalculator();
        
        double num1 = 0;
        double num2 = 0;
        
        boolean input1 = false;
        boolean input2 = false;
        boolean input3 = false;
        
        boolean calculate = false;
        
        String operation = null;
        
        while(!calculate) {
           
            while(!input3) {
                System.out.println("Please enter one of the following operations");
                System.out.println("+");
                System.out.println("-");
                System.out.println("/");
                System.out.println("*");
                System.out.println("Or type exit to quit the program");
                operation = input.nextLine();
                
                if ((operation.equals("+")) || (operation.equals("-")) || 
                (operation.equals("*")) || (operation.equals("/"))) {
                    input3 = true;
                } else if ((operation.equals("Exit")) || operation.equals("exit")){
                    System.out.println("Thank you for using me");
                    System.exit(0);
                } else 
                    System.out.println("Invalid operation");
            }
            
            System.out.println();
            
            while(!input1) {
                System.out.println("Please enter a number");
                try {
                    num1 = Double.parseDouble(input.nextLine());
                    input1 = true;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number");
                    System.out.println();
                }
            }
            
            System.out.println();
        
            while(!input2) {
                System.out.println("Please enter another number");
                try {
                    num2 = Double.parseDouble(input.nextLine());
                    input2 = true;
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid number");
                    System.out.println();
                }
            }
            
            System.out.println();
            
            calc.setNum1(num1);
            calc.setNum2(num2);
            calc.setOperand(operation);
            System.out.println("The result is: " + calc.getResult());
            System.out.println();
            
            input1 = false;
            input2 = false;
            input3 = false;
            
        }
    }
}