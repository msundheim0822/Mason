import java.util.Random;

public class ComputerPlayer implements Player{
    
    Random pick = new Random();
    
    String name;
    
    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String getName() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMove() {
        int temp = pick.nextInt(9) + 1;
        String choice = Integer.toString(temp);
        return choice;
    }
    
}
