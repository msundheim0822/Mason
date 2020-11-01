import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the name of your dog?"); //Asks for dog's name
        String dog = input.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " 
                +  dog +  " prestigious background right here.");
        
        System.out.println();
        System.out.println(dog + " is:");
        
        int percent = 100; //Overall percent of genetics
        Random gene = new Random();
        
        int first = gene.nextInt(percent - 5) + 1; //Calulating the first Gene
        System.out.println(first + "% Chihuahua");
        percent = percent - first;
        
        int second = gene.nextInt(percent - 4) + 1; //Calulating the second Gene
        percent = percent - second;
        System.out.println(second + "% Doberman");
        
        int third = gene.nextInt(percent - 3) + 1; //Calulating the third Gene
        percent = percent - third;
        System.out.println(third + "% St. Bernard");
        
        int fourth = gene.nextInt(percent - 2) + 1; //Calulating the fourth Gene
        percent = percent - fourth;
        System.out.println(fourth + "% Bulldog");
        
        System.out.println(percent + "% Beagle"); //Final Gene
    }
}
