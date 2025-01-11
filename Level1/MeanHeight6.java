import java.util.Scanner;

public class MeanHeight6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

     
       //declaring an array of size 10
       double players[]=new double[11];

       //declaring a variable named total to store the total sum of all values
        double total = 0;

       //taking input
       for(int i=0;i<11;i++){
          System.out.println("Enter the height of player" + (i+1));
          players[i]=input.nextDouble();
       }

       //calculating total sum of height
       
       for(int i=0;i<11;i++){
          total = total + players[i];
       }

       //calculating the mean height of a team
       double meanHeight = total / 11;
       
      //displaying the result
       System.out.println("The mean height of 11 players is " + meanHeight);
   

       input.close();
    }
}
