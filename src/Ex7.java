import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Seconds: ");
        int seconds_in = in.nextInt();

        int hours = seconds_in / 3600;

        int minutes = (seconds_in % 3600) / 60;

        int seconds = (seconds_in % 60);

        System.out.printf("hours: %d %n", hours);
        System.out.printf("minutes: %d %n", minutes);
        System.out.printf("seconds: %d", seconds);


    }
}
