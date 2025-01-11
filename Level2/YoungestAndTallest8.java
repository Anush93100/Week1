// Finding the youngest and tallest friend among three friend

import java.util.Scanner;

public class YoungestAndTallest8 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Taking the input ages of all three friends
		System.out.println("Enter the ages of all three friend:");

		System.out.println("Enter the ages of first friend:");
		int ageA = input.nextInt();

		System.out.println("Enter the ages of second friend:");
		int ageB = input.nextInt();

		System.out.println("Enter the ages of Third friend:");
		int ageC = input.nextInt();

		// Calculating the youngest
		if (ageA < ageB && ageA < ageC) {
			System.out.println("The Youngest friend is the first friend:");
		} else if (ageB < ageA && ageB < ageC) {
			System.out.println("The Youngest friend is the second friend:");
		} else {
			System.out.println("The Youngest friend is the Third friend:");
		}

		// Taking the height of the friends
		System.out.println("Enter the heights of all the three friend:");

		System.out.println("Enter the height of first friend:");
		double heightA = input.nextDouble();

		System.out.println("Enter the height of second friend:");
		double heightB = input.nextDouble();

		System.out.println("Enter the height of Third friend:");
		double heightC = input.nextDouble();

		// Calculating the Tallest among them

		if (heightA > heightB && heightA > heightC) {
			System.out.println("The Tallest friend is the first friend");
		} else if (heightB > heightA && heightB > heightC) {
			System.out.println("The Tallest friend is the second friend");
		} else {
			System.out.println("The Tallest friend is the Third friend");
		}

		input.close();
	}
}