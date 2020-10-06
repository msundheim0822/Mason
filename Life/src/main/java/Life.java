import java.util.Scanner;

public class Life {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name;
        int year;
        
        System.out.println("Hi! What's your name?");
        name = input.nextLine();
        
        System.out.println(name + ", what year were you born?");
        year = Integer.parseInt(input.nextLine());
        
        if (year < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }
        if (year < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago.");
        }
        if (year < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT!");
        }
        if (year < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (year < 1965) {
            System.out.println("MASH TV series has been around for almost half a century!");
        }
    }
}
