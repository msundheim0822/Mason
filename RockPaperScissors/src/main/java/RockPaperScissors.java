import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        Random hand = new Random();
        
        boolean over = false; //To tell if you're stil playing
        
        //Number of wins, losses, and ties
        int ties = 0;
        int wins = 0;
        int losses = 0;
        
        int matches = 0;
        
        while(!over) {
            
            //Find out how matches you want to play
            boolean valid = false;
            
            while (!valid) {
                System.out.println("How many matches do you want to play?");
                 matches = Integer.parseInt(input.nextLine());
            
                if ((matches < 1) || (matches > 10))
                    System.out.println("Invalid number");
                else
                    valid = true;
            }
            
            int i = 1; 
            
            while(i <= matches) {
                
                System.out.println();
                System.out.println("Round " + i);
                
                System.out.println("Press 1 for rock, 2 for paper, 3 for scissors");
                String choice = input.nextLine();
                
                int computer = hand.nextInt(3); //Finding out what the computer is throwing
                switch (choice) {
                    case "1": //You throw rock
                        if (computer == 0) {
                            System.out.println("Tie go again!"); //Computer throws rock
                            ties++;
                            i++;
                        } else if (computer == 1) {
                            System.out.println("Paper beats Rock!"); //Computer throws paper
                            losses++;
                            i++;
                        } else if (computer == 2) {
                            System.out.println("Rock beats Scissors!"); //Computer throws scissors
                            wins++;
                            i++;
                        }   break;
                    case "2": //You throw paper
                        if (computer == 0) {
                            System.out.println("Paper beats Rock!"); //Computer throws rock
                            wins++;
                            i++;
                        } else if (computer == 1) {
                            System.out.println("Tie go again!"); //Computer throws paper
                            ties++;
                            i++;
                        } else if (computer == 2) {
                            System.out.println("Scissors beat Paper!"); //Computer throws scissors
                            losses++;
                            i++;
                        }   break;
                    case "3": //You throw scissors
                        if (computer == 0) {
                            System.out.println("Rock beats Scissors!"); //Computer throws rock
                            losses++;
                            i++;
                        } else if (computer == 1) {
                            System.out.println("Scissors beats Paper!"); //Computer throws paper
                            wins++;
                            i++;
                        } else if (computer == 2) {
                            System.out.println("Tie go again!"); //Computer throws scissors
                            ties++;
                            i++;
                        }   break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
            
            //Game is over and results are printed out
            System.out.println();
            System.out.println("Ties: " + ties + ", Wins: " + wins + ", Losses: " + losses);
            
            if (wins > losses) {
                System.out.println("You win!");
            } else if (losses > wins) {
                System.out.println("You lose");
            } else if (wins == losses) {
                System.out.println("It's a tie");
            }
            
            //Finding out if the player wants to play again
            boolean playAgain = false;
            
            //Keeps on looping until the user selects yes or no
            while(!playAgain) {
                System.out.println("Do you want to play again?");
                String answer = input.nextLine();
            
                if((answer.equals("No")) || (answer.equals("no"))){
                    over = true;
                    playAgain = true;
                    System.out.println("Thanks for playing");
                } else if ((answer.equals("Yes")) || (answer.equals("yes"))) { 
                //Used to reset wins, losses, and ties
                    ties = 0;
                    wins = 0;
                    losses = 0;
                    playAgain = true;
                }
            }
        }
    } 
}