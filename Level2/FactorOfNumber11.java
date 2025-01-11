// Calculating the factor using loop

import java.util.Scanner;

public class FactorOfNumber11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking the input from user
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        // calculating the factors of the numbers
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " is a factor of number " + number);
            }
        }

        input.close();

    }
}