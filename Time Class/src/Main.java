public class Main {
    public static void main(String[] args) {
        Time one = new Time(0,0,0);
        System.out.println("Time Right Now: " + one.toString());
        System.out.println("Previous Second: " + one.previousSecond().toString());
        System.out.println("Next Second: " + one.nextSecond().toString());
        System.out.println("Next Second: " + one.nextSecond().toString());
        System.out.println("___________________________________________________");
        Time two = new Time(23,59,59);
        System.out.println("Time Right Now: " + two.toString());
        System.out.println("Previous Second: " + two.previousSecond().toString());
        System.out.println("Next Second: " + two.nextSecond().toString());
        System.out.println("Next Second: " + two.nextSecond().toString());
    }
}
