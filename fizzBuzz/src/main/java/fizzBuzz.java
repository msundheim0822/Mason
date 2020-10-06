import java.util.Scanner;

public class fizzBuzz {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many fizzes and buzzes do you want");
        int count = Integer.parseInt(input.nextLine());
        
        int i = 0;
        
        while(count > 0)                                  
        { 
            i++;
            
            if (i%15==0) {                                              
                System.out.println("FizzBuzz");
                count-- ;
            } else if (i%5==0)  {     
                System.out.println("Buzz"); 
                count-- ;
            } else if (i%3==0)  {    
                System.out.println("Fizz");  
                count-- ;
            } else 
                System.out.println(i);                          
        }
        System.out.println("TRADITION!");
    }
}
