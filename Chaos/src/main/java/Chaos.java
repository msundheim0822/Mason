import java.util.Random;

public class Chaos {
    
    
    public static void main(String[] args) {

        String color = color(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = color(); // call color method again here
        int weight = number(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = number(10, 20); // call number method,
            // with a range between 10 - 20
        int number = number(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = number(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String color() {
        return "magenta";
    }
   
    public static String animal() {
        return "mammoth";
    }
    
    public static int number(int min, int max) {
        Random randomizer = new Random();
        int x = randomizer.nextInt(max - min + 1) + min;
        return x;
    }
}