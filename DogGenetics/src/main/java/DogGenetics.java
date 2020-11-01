import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        Dog dog = new Dog();
        
        System.out.println("What is the name of your dog?"); //Asks for dog's name
        String name = input.nextLine();
        
        dog.setName(name);
        
        System.out.println("Well then, I have this highly reliable report on " 
                +  dog.getName() +  " prestigious background right here.");
        
        System.out.println();
        System.out.println(dog.getName() + " is:");
        
        dog.getHeritage();
    }
}
