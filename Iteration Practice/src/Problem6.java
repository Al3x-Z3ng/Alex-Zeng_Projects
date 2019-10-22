import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The computer will print out the factors of 7 in your desired range.");
        System.out.println("Start by putting in the lowest number you want in your range below");
        int low = scan.nextInt();
        System.out.println("Now enter the highest number in your range below");
        int high = scan.nextInt();
        int number = 0;
        for (int i = low;  i <= high; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " is a factor");
                System.out.println(" ");
                number = number + 1;
            }
        }
        if (number != 1) {
            System.out.println("There are " + number + " factors.");
        }
        else if (number == 1) {
            System.out.println("There is " + number + " factor.");
        }

    }
}
