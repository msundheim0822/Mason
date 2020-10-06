import java.util.Scanner;

public class fieldDay {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What's your last name?");
        String lastName = input.nextLine();
    
        if (lastName.compareTo("Baggins") < 0) {
            System.out.println("You're on team Red Dragons!");
        } else if (lastName.compareTo("Dresden") < 0) {
            System.out.println("You're on team Dark Wizards!");
        } else if (lastName.compareTo("Howl") < 0) {
            System.out.println("You're on team Moving Castels!");
        } else if (lastName.compareTo("Potter") < 0) {
            System.out.println("You're on team Golden Snitches!");
        } else if (lastName.compareTo("Vimes") < 0) {
            System.out.println("You're on team Night Guards!");
        } else {
            System.out.println("You're on team Black Holes!");
        }
        
        System.out.println("Good Luck!");
    } 
}
