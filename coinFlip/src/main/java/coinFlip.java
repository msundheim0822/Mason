import java.util.Random;

public class coinFlip {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        int coin = randomizer.nextInt(2);
        
        if (coin == 0) {
            System.out.println("I got heads");
        } else if (coin == 1) {
            System.out.println("I got tails");
        }
    }
}
