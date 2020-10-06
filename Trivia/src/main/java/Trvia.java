import java.util.Scanner;

public class Trvia {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int answer;
        int count = 0;
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code                      2) Assembly Language");
        System.out.println("3) C#				4) Machine Code");
        System.out.println();
        System.out.println("YOUR ANSWER: ");
        answer = Integer.parseInt(input.nextLine());
        
        if (answer == 4) {
            count += 1;
        }
        
        System.out.println();
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper                 2) Alan Turing");
        System.out.println("3) Charles Babbage              4) Larry Page");
        System.out.println();
        System.out.println("YOUR ANSWER: ");
        answer = Integer.parseInt(input.nextLine());
        
        if (answer == 2) {
            count += 1;
        }
        
        System.out.println();
        
        System.out.println("LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity                     2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise           4) The Millennium Falcon");
        System.out.println();
        System.out.println("YOUR ANSWER: ");
        answer = Integer.parseInt(input.nextLine());
        
        if (answer == 3) {
            count += 1;
        }
        
        System.out.println("Nice job! You got "+ count + " correct");
    }
}
