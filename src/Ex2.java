import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");

        System.out.println("Welcome to the grass cutting simulator!");

        //Taking in the yard dimensions
        System.out.println("Please enter the length of your yard: ");
        double yard_length = in.nextInt();
        System.out.println("Please enter the width of your yard: ");
        double yard_width = in.nextInt();

        //Taking in the house dimensions
        System.out.println("Please enter the length of your house: ");
        double house_length = in.nextInt();
        System.out.println("Please enter the width of your house: ");
        double house_width = in.nextInt();

        double yard_area = yard_length * yard_width;
        double house_area = house_length * house_width;

        double grass_area = yard_area-house_area;
        double time_to_cut = grass_area /2;

        System.out.printf("The time to cut the grass in seconds is: %.2f", time_to_cut);
    }
}
