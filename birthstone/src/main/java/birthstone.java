import java.util.Scanner;

public class birthstone {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int month;
        
        System.out.println("What month's birthday do you want to know?");
        month = Integer.parseInt(input.nextLine());
        
        if (month == 1) {
            System.out.println("January is Garnet");
        } else if (month == 2) {
            System.out.println("February is Amethyst");
        } else if (month == 3) {
            System.out.println("March is Aquamarine");
        } else if (month == 4) {
            System.out.println("April is Diamond");
        } else if (month == 5) {
            System.out.println("May is Emerald");
        } else if (month == 6) {
            System.out.println("June is Pearl");
        } else if (month == 7) {
            System.out.println("July is Ruby");
        } else if (month == 8) {
            System.out.println("August is Peridot");
        } else if (month == 9) {
            System.out.println("September is Sapphire");
        } else if (month == 10) {
            System.out.println("October is Opal");
        } else if (month == 11) {
            System.out.println("November is Citrine");
        } else if (month == 12) {
            System.out.println("December is Turquoise");
        } 
    }
}