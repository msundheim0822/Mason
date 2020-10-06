import java.util.Random;

public class Lazy {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        boolean clean = false;

        int count = 0;
        
        do {
            count++;
            System.out.println("Clean your room!! (x" + count + ")");
            int yell = randomizer.nextInt(10);
            if (yell == 0){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                break;
            }
            if (count == 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (!clean);
    }
}
