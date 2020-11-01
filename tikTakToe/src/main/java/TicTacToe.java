import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
       
        Player player1 = null;
        Player player2 = null;
        
        boolean valid = false;
        
        String[] arr =  {"1", "2", "3", "4", "5", "6", "7", "8" ,"9"};
        
        while(!valid) {
            System.out.println("Do you want user 1 to be a player or a computer?");
            String user1 = input.nextLine();
            
            if (user1.equals("computer")) {
                player1 = new ComputerPlayer();
                player1.setName("Computer 1");
                valid = true;
            } else if (user1.equals("player")) {
                player1 = new HumanPlayer();
                System.out.println("What is the name of player 1?");
                String name = input.nextLine();
                player1.setName(name);
                valid = true;
            } else {
                System.out.println("Not a valid choice");
            }
        }
        
        valid = false;
        
        while(!valid) {
            System.out.println("Do you want user 2 to be a player or a computer?");
            String user2 = input.nextLine();
            
            if (user2.equals("computer")) {
                player2 = new ComputerPlayer();
                player2.setName("Computer 2");
                valid = true;
            } else if (user2.equals("player")) {
                player2 = new HumanPlayer();
                System.out.println("What is the name of player 2?");
                String name = input.nextLine();
                player2.setName(name);
                valid = true;
            } else {
                System.out.println("Not a valid choice");
            }
        }
        
        System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2]);
            System.out.println("----------");
            System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5]);
            System.out.println("----------");
            System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8]);
        
            System.out.println();
        
        boolean playing = false;
        boolean turn = false;
        
        while(!playing) {
            
            if(turn == false) {
                System.out.println("It's " + player1.getName() + "'s turn!");
                String move = player1.getMove();
                for(int i = 0; i < 9; i++) {
                    if(arr[i].equals(move)) {
                        arr[i] = "X";
                        turn = true;
                        counter++;
                    } else if (arr[i].equals("X")){
                        System.out.println("Space has already been taken");
                    }
                }
            } else if (turn == true) {
               System.out.println("It's " + player2.getName() + "'s turn!");
               String move = player2.getMove();
                for(int i = 0; i < 9; i++) {
                    if(arr[i].equals(move)) {
                        arr[i] = "O";
                        turn = false;
                        counter++;
                    } else if (arr[i].equals("X")){
                        System.out.println("Space has already been taken");
                    }
                } 
            }
            
            System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2]);
            System.out.println("----------");
            System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5]);
            System.out.println("----------");
            System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8]);
        
            System.out.println();
            
            if ((arr[0].equals("X")) && (arr[1].equals("X")) && (arr[2]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[0].equals("X")) && (arr[4].equals("X")) && (arr[8]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[0].equals("X")) && (arr[3].equals("X")) && (arr[6]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[1].equals("X")) && (arr[4].equals("X")) && (arr[7]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[2].equals("X")) && (arr[4].equals("X")) && (arr[6]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[2].equals("X")) && (arr[5].equals("X")) && (arr[8]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[3].equals("X")) && (arr[4].equals("X")) && (arr[5]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[6].equals("X")) && (arr[7].equals("X")) && (arr[8]).equals("X")) {
                System.out.println(player1.getName() + " Wins!");
                break;
            } else if ((arr[0].equals("O")) && (arr[1].equals("O")) && (arr[2]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[0].equals("O")) && (arr[4].equals("O")) && (arr[8]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[0].equals("O")) && (arr[3].equals("O")) && (arr[6]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[1].equals("O")) && (arr[4].equals("O")) && (arr[7]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[2].equals("O")) && (arr[4].equals("O")) && (arr[6]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[2].equals("O")) && (arr[5].equals("O")) && (arr[8]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[3].equals("O")) && (arr[4].equals("O")) && (arr[5]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            } else if ((arr[6].equals("O")) && (arr[7].equals("O")) && (arr[8]).equals("O")) {
                System.out.println(player2.getName() + " Wins!");
                break;
            }
            
            if(counter == 9) {
                System.out.println("It's a tie");
                break;
            }
        }
    }
}
