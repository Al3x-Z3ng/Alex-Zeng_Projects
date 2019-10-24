import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String computerChoice = "";
        int randomNumber = (int)(Math.random()*3 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors,");
        System.out.println("Rock crushes scissor, Scissor cuts paper, and paper wraps up rock.");
        System.out.println("Choose rock, paper, or scissors and let luck decide for your victory!");
        System.out.println("Please enter your choice below in all LOWERCASE");
        String choice = scan.next();
        if (randomNumber==1){
            computerChoice = "paper!";
        }
         else if (randomNumber==2){
            computerChoice = "rock!";
        }
        else if (randomNumber==3){
            computerChoice = "scissors!";
        }
        System.out.println("Computer chooses " + computerChoice);
        if (computerChoice .equals("paper!")  && choice .equals("paper")){
            System.out.println("This is a tie, thanks for playing and better luck next time!");
        }
        else if (computerChoice .equals("paper!") && choice .equals("scissors")) {
            System.out.println("Congratulations, you won!");
        }
        else if (computerChoice .equals("paper!") && choice .equals("rock")) {
            System.out.println("Unfortunately, you lost, better luck next time!");
        }
        if (computerChoice .equals("rock!") && choice.equals("rock")){
            System.out.println("This is a tie, thanks for playing and better luck next time!");
        }
        else if (computerChoice .equals("rock!") && choice .equals("scissors")) {
            System.out.println("Unfortunately, you lost, better luck next time!");
        }
        else if (computerChoice .equals("rock!") && choice .equals("paper") ) {
            System.out.println("Congratulations, you won!");
        }
        if (computerChoice .equals("scissors!") && choice .equals("scissors")){
            System.out.println("This is a tie, thanks for playing and better luck next time!");
        }
        else if (computerChoice .equals("scissors!") && choice.equals("rock")) {
            System.out.println("Congratulations, you won!");
        }
        else if (computerChoice .equals("scissors!") && choice .equals("paper")) {
            System.out.println("Unfortunately, you lost, better luck next time!");
        }
    }
}
