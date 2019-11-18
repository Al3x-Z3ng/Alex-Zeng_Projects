public class arrayPractice2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;
        int temp;
        System.out.println("Index: " + "| Values: ");
        for (int i = 0; i < arr.length; i++) {
            int value = (int) (Math.random() * 100 + 1);
            arr[i]= value;
            total = total + value;
            System.out.println( "  " + i + "    |   " + arr[i]);
        }
        System.out.println(" ");
        System.out.println("The average value is " + total / arr.length + ".");
        System.out.println("____________________________________________");
        System.out.println(" ");
        System.out.println("List with 2 Values Swapped:");
        System.out.println("Index: " + "| Values: ");
        temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;
        for (int i = 0; i <arr.length; i++) {
            System.out.println( "  " + i + "    |   " + arr[i]);
        }
        System.out.println("____________________________________________");
        System.out.println(" ");
        System.out.println("List with reversed values:");
        System.out.println("Index: " + "| Values: ");

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( "  " + i + "    |   " + arr[i]);
        }
    }
}