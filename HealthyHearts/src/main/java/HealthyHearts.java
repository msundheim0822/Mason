import java.util.Scanner;

public class HealthyHearts {

    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        //Asking for age
        System.out.println("What is your age?");
        int age = Integer.parseInt(input.nextLine());
        
        int maxHeartRate = 220 - age; //Calculating max heart rate
        
        System.out.println("Your maximum heart rate should be " + maxHeartRate + 
                " beats per minute");
        
        double targetMin = (double)maxHeartRate * (50.0/100.0); //Calculating minimum target heart rate
        double targetMax = (double)maxHeartRate * (85.0/100.0); //Calculating maximum target heart rate
        
        System.out.println("Your target Zone is " + targetMin + " - " + targetMax + " beats per minute");
    }
}