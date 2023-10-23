import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String R = "R";
        String P = "P";
        String S = "S";
        String player1 = "";
        String player2 = "";
        String confirm = "";
        boolean Continue = true;

        do {

            Continue = true;

            do {
                System.out.println("Player 1, enter Rock, Paper, or Scissors. [R, P, S]");

                if(scan.hasNextLine()){
                    player1 = scan.nextLine();
                    player1 = player1.toUpperCase();
                    if(player1.equals(R) || player1.equals(P) || player1.equals(S)){
                        break;
                    }
                }

                System.out.println("Invalid input. Please try again.");
            } while (true);

            do {
                System.out.println("Player 2, enter Rock, Paper, or Scissors. [R, P, S]");

                if(scan.hasNextLine()){
                    player2 = scan.nextLine();
                    player2 = player2.toUpperCase();
                    if(player2.equals(R) || player2.equals(P) || player2.equals(S)){
                        break;
                    }
                }

                System.out.println("Invalid input. Please try again.");
            } while (true);

            //Which player wins
            if(player1.equals(R) && player2.equals(S)){
                System.out.println("Rock Beats Scissors, Player 1 wins");
            }else if(player1.equals(P) && player2.equals(R)){
                System.out.println("Paper Beats Rock, Player 1 wins");
            }else if(player1.equals(S) && player2.equals(P)){
                System.out.println("Scissors Beats Paper, Player 1 wins");
            }

            if(player2.equals(R) && player1.equals(S)){
                System.out.println("Rock Beats Scissors, Player 2 wins");
            }else if(player2.equals(P) && player1.equals(R)){
                System.out.println("Paper Beats Rock, Player 2 wins");
            }else if(player2.equals(S) && player1.equals(P)){
                System.out.println("Scissors Beats Paper, Player 2 wins");
            }

            if(player1.equals(player2)){
                System.out.println("Tie!");
            }

            do {
                System.out.println("Would you like to continue? (Y/N)");
                if(scan.hasNextLine()){
                    confirm = scan.nextLine();
                    if(confirm.equalsIgnoreCase("N")){
                        break;
                    }
                    if(confirm.equalsIgnoreCase("Y")){
                        Continue = false;
                    }else{
                        System.out.println("You have entered an invalid input. Please try again");
                    }
                }
            } while (Continue);

            if(confirm.equalsIgnoreCase("N")){
                break;
            }

        } while (true);
    }
}