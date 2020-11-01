
import java.util.Random;

public class Dog {

    private String name;
    
    public void setName(String dog) {
        
        this.name = dog;
    }
    
    public String getName(){
        return name;
    }
    
    public void getHeritage() {
        
        Random gene = new Random();
        
        int amount = 100;
        
        for(int i = 5; i > 1; i--) {
            int percent = gene.nextInt(amount - i) + 1;
            amount = amount - percent;
            
            if (i == 5) 
                System.out.println(percent + "% Chihuahua");
            else if (i == 4)
                System.out.println(percent + "% Doberman");
            else if (i == 3)
                System.out.println(percent + "% St. Bernard");
            else if (i == 2)
                System.out.println(percent + "% Bulldog");
        }  
        
        System.out.println(amount + "% Beagle");
    }
}
