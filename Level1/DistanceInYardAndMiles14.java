import java.util.Scanner;

public class DistanceInYardAndMiles14{

	public static void main(String[] args){
		
                Scanner input =new Scanner(System.in);

                //taking input in feet
             System.out.println("Enter the distance in feet");
                double distanceInFeet = input.nextDouble();
  
               //calculating distance in yard
                double distanceInYard = distanceInFeet /3;
               
              
               //calculating distance in miles
                double distanceInMiles = distanceInYard /1760;

              //printing the distance in miles and yard
              System.out.println("The distance in yards is "+ distanceInYard+" while the distance in miles is " + distanceInMiles);

               input.close();
	}
}