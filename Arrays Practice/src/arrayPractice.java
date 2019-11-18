public class arrayPractice {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = (int)(Math.random()*6 + 1);
            arr[i]= value;
            System.out.println("Index: " + i + " Values: " + arr[i]);
            if (arr[i] == 1){
                number = number + 1;
            }
        }
        if (number != 1) {
            System.out.println(" ");
            System.out.println("There are " + number + " '1's'");
        }
        else if (number == 1) {
            System.out.println(" ");
            System.out.println("There is only " + number + " '1'");
        }
    }
}
