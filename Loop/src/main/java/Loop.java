import java.util.Scanner;

public class Loop {
    
    public static void main(String[] agrs) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to start at?");
        int begin = Integer.parseInt(input.nextLine());
        
        System.out.println("What number do you want to end at?");
        int end = Integer.parseInt(input.nextLine());
        
        for (int j = begin; j <= end; j++) {
            if(j%2 == 0){
                System.out.println(j);
            }
  
        }
    }
}
