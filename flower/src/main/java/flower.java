import java.util.Random;

public class flower {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        boolean love = true;
        
        int petals = randomizer.nextInt(20);
        
        System.out.println(petals);
        
        while (petals > 0) {
            
            if (love == true){
                System.out.println("She loves me.");
                petals--;
                love = false;
            } else if (love == false) {
                System.out.println("She loves me not.");
                petals--;
                love = true;
            }
        }
        
        if(love == false) {
            System.out.println("SHE LOVES ME!!!");
        } else if (love == true) {
            System.out.println("She doesn't love me...");
        }
    }
}
