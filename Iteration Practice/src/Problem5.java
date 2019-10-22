import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create a password for your account below");
        String password = scan.next();
        System.out.println("Confirm your password by re-entering it below");
        while (!password.equals(scan.next())) {
            System.out.println("The passwords do not match, please try again.");
        }
        System.out.println("Password created successfully.");

    }
}
