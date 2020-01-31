import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double CON_KILOMETERS = 1.60935;

        System.out.println("Please enter your distance in miles: ");
        double miles = in.nextDouble();

        double kilometers = miles * CON_KILOMETERS;

        System.out.printf("%.2f miles in kilometers is: %.2f", miles, kilometers);
    }
}
