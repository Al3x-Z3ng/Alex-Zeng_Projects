import java.util.Scanner;

public class RPSLOOP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper & Scissors! Type in 'r' for rock, 'p' for paper, and 's' for scissors.");
        System.out.println("To exit game, type in 'x'.");
        System.out.println("************************************************************");
        System.out.println("You choose:");
        String choice = scan.next();
        String computerChoice = "";
        int win, losses;
        win = 0;
        losses = 0;
        while (choice .equals("p") || choice.equals("s") || choice.equals("r")) {
            int randomNumber = (int)(Math.random()*3 + 1);
            if (randomNumber==1) {
                computerChoice = "paper!";
            }
            else if (randomNumber==2) {
                computerChoice = "rock!";
            }
            else if (randomNumber==3) {
                computerChoice = "scissors!";
            }
            if (computerChoice .equals("paper!")  && choice .equals("p")){
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("This is a tie, thanks for playing and better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("paper!") && choice .equals("s")) {
                win = win + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Congratulations, you won!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("paper!") && choice .equals("r")) {
                losses = losses + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Unfortunately, you lost, better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            if (computerChoice .equals("rock!") && choice.equals("r")){
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("This is a tie, thanks for playing and better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("rock!") && choice .equals("s")) {
                losses = losses + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Unfortunately, you lost, better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("rock!") && choice .equals("p") ) {
                win = win + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Congratulations, you won!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            if (computerChoice .equals("scissors!") && choice .equals("s")){
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("This is a tie, thanks for playing and better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("scissors!") && choice.equals("r")) {
                win = win + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Congratulations, you won!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }
            else if (computerChoice .equals("scissors!") && choice .equals("p")) {
                losses = losses + 1;
                System.out.println("Computer chooses " + computerChoice);
                System.out.println("Unfortunately, you lost, better luck next time!");
                System.out.println("Wins: " + win + " Losses: " + losses);
                System.out.println("************************************************************");
            }

            System.out.println("You choose:");
            choice = scan.next();
        }
        System.out.println("************************************************************");
        if (win < losses && (losses-win)!= 1) {
            System.out.println("Computer won by " + (losses-win) + " rounds!");
        }
        else if (win < losses && (losses-win)==1) {
            System.out.println("Computer won by " + (losses-win) + " round!");
        }
        else if (win > losses && (win-losses)!= 1) {
            System.out.println("You won by " + (win-losses) + " rounds!");
        }
        else if (win > losses && (win-losses)== 1) {
            System.out.println("You won by " + (win-losses) + " round!");
        }
        else if (win == losses && win != 1) {
            System.out.println("You and the computer are tied with " + win + " rounds!");
        }
        else if (win == losses && win == 1) {
            System.out.println("You and the computer are tied with " + win + " round!");
        }
        System.out.println("Thanks for playing!");
    }
}
