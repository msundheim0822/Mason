import java.util.Random;

public class Rolls {
    
    Random roll = new Random();
    
    public void Rolls() {
        
    }
    
    public void results(int money) {
        
        int turns = 0;
        int mostMoney = money;
        int mostTurns = 0;
        
        while (money > 0) {
            
            turns++;
            
            int dice1 = roll.nextInt(6) + 1;
            int dice2 = roll.nextInt(6) + 1;
            
            int sum = dice1 + dice2;
            
            if (sum == 7) {
                money += 4;
            } else {
                money--;
            }
            
            if (money > mostMoney) {
                mostMoney = money;
                mostTurns = turns;
            }
        }
        
        System.out.println("You're broke after " + turns + " turns.");
        System.out.println("You should have quit after " + mostTurns + " turns when you had #" + mostMoney);
    }
}
