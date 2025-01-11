import java.util.Scanner;

public class LargestAndSecondLargest4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Define the initial size of the array and an index to store the digits
        int maxDigits = 10;  
        long[] digits = new long[maxDigits];
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0) {
            // If the index reaches maxDigits, we need to increase the size of the array
            if (index == maxDigits) {
                // Create a new array with a size of maxDigits + 10
                maxDigits += 10;
                long[] temp = new long[maxDigits];
                
                // Copy elements from the old array to the new temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                // Assign the new array to digits
                digits = temp;
            }
            
           
            digits[index] = number % 10;
            number = number / 10;  
            index++; 
        }

        // Variables to store the largest and second largest digit
        long largest = -1;  // Initialize to a value lower than any possible digit (0-9)
        long secondLargest = -1;  // Initialize to -1 since second largest may not exist

        // Loop through the digits array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        input.close();
    }
}

