import java.util.Scanner;

public class Times {
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("what table shall I recite?");
        int num = Integer.parseInt(input.nextLine());
        
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + num + " is: " + i*num);
        }    
    }
}
