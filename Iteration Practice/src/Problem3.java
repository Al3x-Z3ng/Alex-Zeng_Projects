import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age, only between 10 to 50.");
        int age;
        age = scan.nextInt();
        while(age >= 50 || age <= 10){
            System.out.println("Please enter ONLY between 10 and 50!");
            age = scan.nextInt();
        }
        System.out.println("Thank You!");
    }
}
