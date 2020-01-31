import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number of hours: ");
        double hours = in.nextDouble();

        System.out.println("Please enter a number of minutes: ");
        double minutes = in.nextDouble();


        System.out.println("Please enter a number of seconds: ");
        double seconds = in.nextDouble();

        double hours_to_seconds = hours * 3600;
        double minutes_to_seconds = minutes * 60;

        double total_seconds = hours_to_seconds + minutes_to_seconds + seconds;

        System.out.printf("The total time in seconds is: %.2f", total_seconds);
    }
}
