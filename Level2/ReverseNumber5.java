import java.util.Scanner;

public class ReverseNumber5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber = tempNumber / 10; // Remove the last digit
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        tempNumber = number; // Reset the number to original

        // Extract digits from the number and store them in the digits array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10; // Get the last digit
            tempNumber = tempNumber / 10; // Remove the last digit
        }

        // Display the digits in reverse order (which is the reverse of the original
        // number)
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        input.close();
    }
}
