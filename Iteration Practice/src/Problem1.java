import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in 7");
        int input;
        input = scan.nextInt();

        while(input != 7){
            System.out.println("Please enter 7!");
            input = scan.nextInt();
        }
        System.out.println("Thank You!");
    }
}
