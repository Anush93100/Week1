import java.util.Scanner;

public class LengthOfSquare13{

	public static void main(String[] args){
		
                Scanner input =new Scanner(System.in);

                //taking parimeter input
                System.out.println("Enter the perimeter of a Square");
                double perimeter =input.nextDouble();

                //calculating length of side of square
                double side= perimeter/4; 

                //printing side of square  
                System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);            

               input.close();
	}
}