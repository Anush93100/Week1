import java.util.Scanner;

public class StringLength1 {

	// method to find string length
	public static int findingLength(String s) {

		// declaring a count variable
		int count = 0;
		try {
			while (true) {
				s.charAt(count);
				count++;
			}
		} catch (Exception e) {
			//
		}
		return count;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// taking input from the user
		System.out.println("Enter the String:");
		String s = input.next();

		// finding the length of string using user defined methods
		int length1 = findingLength(s);

		// finding the length of string using built-in methods
		int length2 = s.length();

		// displaying the result
		if (length1 == length2) {
			System.out.println("Length Using User Defined method is: " + length1);
			System.out.println("Length Using Built-in method is: " + length2);
			System.out.println("Both the length are equal");
		} else {
			System.out.println("Length Using User Defined method is: " + length1);
			System.out.println("Length Using Built-in method is: " + length2);
			System.out.println("Both the length are not equal");
		}
		input.close();

	}
}