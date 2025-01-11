//Calculating power using loop 

import java.util.Scanner;

public class Power10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking the input from user
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        System.out.println("Enter the power:");
        int power = input.nextInt();

        int result = 1;

        // calculating power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // printing the result
        System.out.println("The result is " + result);

        input.close();

    }
}