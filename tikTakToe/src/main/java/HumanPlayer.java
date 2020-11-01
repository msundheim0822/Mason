import java.util.Scanner;
public class HumanPlayer implements Player{
    
    String name;
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMove() {
        
        String space = null;
        
        boolean valid = false;
       
        while(!valid) {
            System.out.println("What space do you want to chose?");
            space = input.nextLine();
            
            if((space.equals("1")) || (space.equals("2")) || (space.equals("3")) 
               || (space.equals("4")) || (space.equals("5")) || (space.equals("6")) 
               || (space.equals("7")) || (space.equals("8")) || (space.equals("9"))) {
                valid = true;
            } else 
                System.out.println("Not a valid number");
        }
        return space; 
    }  
}
