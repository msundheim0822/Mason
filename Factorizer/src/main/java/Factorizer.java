import java.util.Scanner;

public class Factorizer {
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.println("What number would you like to factor?");
        int num = Integer.parseInt(input.nextLine());   
        perfect(num);
        factor(num);
        prime(num);
    }
    
    public static void perfect(int num) {
        
        int sum = 0;
        
        for(int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        
        if (sum == num){
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
        
    }
    
    public static void factor(int num) {
        
        int count = 0;
        
        System.out.println("the factors of " + num + " are:");
        
        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(num + " has " + count + " factors.");
    }
    
    public static void prime(int num) {
        
        int i = 2;
        boolean prime = false;
        while(i <= num/2){
            if(num % i == 0) {
                prime = true;
                break;
            }
            ++i;
        }
        
        if (!prime) {
            System.out.println(num + " is a prime number.");
        } else
            System.out.println(num + " isn't a prime number");
    }
}
