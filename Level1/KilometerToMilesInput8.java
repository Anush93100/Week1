import java.util.Scanner;

public class KilometerToMilesInput8{
  public static void main(String[] args){
    
Scanner input = new Scanner(System.in);
     
// taking input from user
    System.out.println("Enter the distance in kilometer");
     double kilometer=input.nextDouble();

     //calculating miles for given kilometers
     double miles=kilometer / 1.6;

     //printing distance in kilometer and miles
     System.out.println("The total miles is " + miles+ " mile for the given " + kilometer);

   input.close();
  }
}