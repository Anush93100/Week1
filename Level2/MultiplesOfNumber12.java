//Calculating the multiples of the number

import java.util.Scanner;

public class MultiplesOfNumber12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking the input from the user
        System.out.println("Enter the Number:");
        int number = input.nextInt();

        // Calculating the multiples and printing them
       int multiples = number;
       while(multiples <= 100){
          
            System.out.println("Multiple of " + number + " is " + multiples);
            multiples = multiples + number;
       }

        input.close();
    }
}
