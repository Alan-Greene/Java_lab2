package com.company;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");

        System.out.println("Hello and welcome to degrees converter" + newLine + "Please enter your degrees in fahrenheit: ");
        int user_input = in.nextInt();

        double converted_input = (5.0/9.0) * (user_input - 32);

        System.out.printf("The degrees entered in fahrenheit are: %d %nThe degrees entered in celcius are: %.2f", user_input, converted_input);
    }
}
