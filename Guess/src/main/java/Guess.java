import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int guess = 44;
        int ans;
        
        System.out.println("Pick a number");
        ans = Integer.parseInt(inputReader.nextLine());
        
        if (ans == guess) {
            System.out.println("Nice guess");
        } else if (ans > guess) {
            System.out.println("too bad, too high. It's " + guess);
        } else if (ans < guess) {
            System.out.println("Nice try, too low. It's " + guess);
        }
    }
}
