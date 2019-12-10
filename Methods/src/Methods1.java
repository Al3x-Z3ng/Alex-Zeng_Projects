import java.util.Scanner;

public class Methods1 {
    static int[] add(int[] arr,int num) {
        int[] next = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            next[i] = arr[i];
            next[next.length-1] = num;
        }
        return next;
    }
    static int[] decrease(int[] arr) {
        int[] pop = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            pop[i] = arr[i];
        }
        return pop;
    }
    static int[] insert(int[] arr) {
        int[] between = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            between[i] = arr[i];
        }
        return between;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int [10];
        System.out.println("Index: " + "| Values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1);
            System.out.println("  " + i + "    |   " + arr[i]);
        }
        System.out.println("_______________________________________");
        System.out.println("Added indexes & values:");
        System.out.println("Index: " + "| Values: ");
        int[] next = add(arr,(int)(Math.random()*10 + 1));
        for (int i = 0; i < arr.length+1; i ++ ) {
            if (i < 10) {
                System.out.println("  " + i + "    |   " + next[i]);
            }
            else if (i >= 10) {
                System.out.println("  " + i + "   |   " + next[i]);
            }
        }
        System.out.println("_______________________________________");
        System.out.println("Took away last index & value:");
        System.out.println("Index: " + "| Values: ");
        int[] last = decrease(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("  " + i + "    |   " + last[i]);
        }
        System.out.println("_______________________________________");
        System.out.println("Array with a custom index and value:");
        System.out.println("What position would you like to enter a value?");
        System.out.println("Note: you may only enter into a position between 0 & 10");
        int pos = scan.nextInt();
        while (pos > 10) {
            System.out.println("Please enter a position BETWEEN 0 & 10!");
            pos = scan.nextInt();
        }
        System.out.println("What value would you like to enter?");
        int value = scan.nextInt();
        int[] between = insert(arr);
        System.out.println("Your value input has been entered into index " + pos + ":");
        System.out.println("Index: " + "| Values: ");
        for (int i = 0; i < pos+1; i++) {
            between[pos] = value;
            System.out.println("  " + i + "    |   " + between[i]);
        }
        for (int i = pos + 1; i < arr.length+1; i++) {
            between[i] = arr[i-1];
            if (i < 10) {
                System.out.println("  " + i + "    |   " + between[i]);
            }
            else if (i >= 10) {
                System.out.println("  " + i + "   |   " + between[i]);
            }
        }
    }
}


