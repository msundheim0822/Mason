import java.util.Scanner;

public class luckySevens {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Rolls game = new Rolls();
        
        System.out.println("How much money do you have?");
        int money = Integer.parseInt(input.nextLine());
        
        game.results(money);
    }
}
