import java.util.Scanner;

public class PositiveNegativeZero6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.println("Enter the number");
        int number = input.nextInt();

          // determining whether the number is positive, negative or zero
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        input.close();
    }
}
