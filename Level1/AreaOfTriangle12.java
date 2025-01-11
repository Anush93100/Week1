import java.util.Scanner;

public class AreaOfTriangle12{

	public static void main(String[] args){
		
                Scanner input =new Scanner(System.in);
                
                //enter the height of triangle
                 System.out.println("Enter the height of triangle");
                double heightInCm =input.nextDouble();
 
               //enter the base of triangle
                  System.out.println("Enter the base of triangle");
                double baseInCm =input.nextDouble();

              // calculating area of triangle
               double areaInCm = 0.5 * heightInCm * baseInCm;

               //converting cm in feet
               double  heightInInch= heightInCm /2.54;
               double baseInInch =  baseInCm / 2.54;
               double areaInInch = 0.5 * heightInInch * baseInInch;
 
              //printing area of triangle
              System.out.println("Area of triangle in Cm square is " + areaInCm + " , while area of triangle in feet inch is " + areaInInch);

            input.close();
             
	}
}