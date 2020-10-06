import java.util.Random;

public class fortuneCookie {
    
    public static void main(String [] args) {
        
        Random randomizer = new Random();
        
        int x = randomizer.nextInt(10);
        
       switch (x) {
            case 0:
                System.out.println("Never go in against a Sicilian when death is on the line!");
                break;
            case 1:
                System.out.println("With great power, there must also come — great responsibility.");
                break;
            case 2:
                System.out.println("Never argue with the data.");
                break;
            case 3:
                System.out.println("Try not. Do, or do not. There is no try.");
                break;
            case 4:
                System.out.println("You are a leaf on the wind, watch how you soar.");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
            case 6:
                System.out.println("Make it so.");
                break;
            case 7:
                System.out.println("I am invenitable");
                break;
            case 8:
                System.out.println("Can you call me Joker?");
                break;
            case 9:
                System.out.println("Save Martha");
                break;
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}
