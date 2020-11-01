import java.text.NumberFormat;
import java.util.Scanner;

public class Interest {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("How much do you want to invest?");
        int investment = Integer.parseInt(input.nextLine());;
        System.out.println("How many years are you investing?");
        int year = Integer.parseInt(input.nextLine());;
        System.out.println("What is the annual interest rate % growth?");
        double interest = Integer.parseInt(input.nextLine());;
        interest = interest/100;
        System.out.println("Is it compounded monthly, quarterly, or annually?");
        String answer = input.nextLine();
        
        int compound = 0;
        
        if(answer.equals("monthly")) {
            compound = 12;
        } else if (answer.equals("quarterly")) {
            compound = 4;
        } else if (answer.equals("annually")) {
            compound = 1;
        }      
        
        double amount = investment;
        
        for (int i = 1; i <= year; i++) {
            
            System.out.println("Year " + i + ":");
            amount = calulate(investment, i, interest, compound, amount);
            System.out.println();
        }  
    }  
    
    public static double calulate (int p, int t, double r, int n, double previous) {
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Began with " + formatter.format(previous));
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest;
        
        cinterest = amount - previous;
        
        System.out.println("Earned " + formatter.format(cinterest));
        System.out.println("Ended with " + formatter.format(amount));
        
        return amount;
    }
} 