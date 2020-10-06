import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        Scanner input = new Scanner(System.in);
    
        int x = randomizer.nextInt(201) - 100;
        int guess;
        
        System.out.println("I've chose a number between -100 and 100 guess what it is?");
        guess = Integer.parseInt(input.nextLine());;
        
        while(guess != x) {
            if (guess > x) {
                System.out.println("Too hight try again");
                guess = Integer.parseInt(input.nextLine());
            } else if (guess < x) {
                System.out.println("Too low try again");
                guess = Integer.parseInt(input.nextLine());
            }
        }
        
        System.out.println("Wow you managed to guess it ");
    }
}
