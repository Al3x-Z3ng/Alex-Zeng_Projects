import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades would you like to enter?");
        int amount, grades;
        amount = scan.nextInt();
        grades = 0;
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter your grades here:");
            grades = grades + scan.nextInt();
        }
        System.out.println("Your total grades are " + grades + ", your average is " + grades/amount + ".");
    }
}
