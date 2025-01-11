import java.util.Scanner;

public class Natural4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the first number:");
        int number = input.nextInt();

        // determining whether the number is natural number or not
        if (number > 0) {

            // calculating sum of n numbers
            int sum = (number * (number + 1)) / 2;

            // printing result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        input.close();
    }
}
