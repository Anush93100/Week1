import java.util.Scanner;

public class HeightConvert10{

	public static void main(String[] args){
		
                Scanner input =new Scanner(System.in);
                
               //taking user height's input
               System.out.println("Enter the height in centimeter");
               double heightInCm = input.nextDouble();
               
              //calculating user height in feet
              double heightInFeet = heightInCm / (12 *2.54);
               
              
              //calculating user height in inch
              double heightInInch = heightInCm / 2.54;

             //printing user height in feet and inch
             System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInch);

            input.close();
 
	}
}