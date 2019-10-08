import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String computerChoice = "";
        int randomNumber = (int)(Math.random()*3 + 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors,");
        System.out.println("Rock crushes scissor, Scissor cuts paper, and paper wraps up rock.");
        System.out.println("Choose rock, paper, or scissors and let luck decide for your victory!");
        System.out.println( );
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
        if (computerChoice == "paper!"){
            System.out.println("If you chose scissors then congratulations, you won! If you chose rock then you lost.");
        }
        if (computerChoice == "rock!"){
            System.out.println("If you chose paper then congratulations, you won! But if you chose scissor then better luck next time.");
        }
        if (computerChoice == "scissors!"){
            System.out.println("If you chose rock, you're the winner! But if you chose paper then you got cut up.");
        }










    }
}
