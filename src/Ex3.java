import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Taking user input
        System.out.println("Please enter your first number: ");
        float num1 = in.nextFloat();

        System.out.println("Please enter your wecond number: ");
        float num2 = in.nextFloat();

        //Doing calculations
        float sum = num1 + num2;
        float difference = num1 - num2;
        float product = num1 * num2;

        System.out.printf("Sum: %.2f%nDifference: %.2f%nProduct: %.2f", sum, difference, product);
    }
}
