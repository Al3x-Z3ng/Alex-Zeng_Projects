import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number would you like to enter?");
        int number = scan.nextInt();
        System.out.println("How many do you want to double this number?");
        int times = scan.nextInt();
        for (int i = 0; i < times; i++) {
            number = number * 2;
            System.out.println(number);
        }
    }
}