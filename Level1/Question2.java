import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       //declaring an array of size 10
       int number[]=new int[5];

      //taking input from the user
      for(int i=0;i<5;i++){
         System.out.println("Enter the number" + (i+1) + ". ");
         number[i]=input.nextInt();
      }

     //calculating and printing the result
     for(int i=0;i<5;i++){
            if(number[i]>0){
                  if(number[i]%2==0){
                     System.out.println("The number " + number[i] + " is positive and even.");
                   }
                   else{
                     System.out.println("The number " + number[i] + " is positive and odd.");
                   }
            }
            else if(number[i]==0){
               System.out.println("The number is zero.");
            }
            else{
                System.out.println("The number " + number[i] +" is negative.");
            }
        }

       //comparing the first and last element
       if(number[0]==number[4]){
          System.out.println("The first and the last numbers are equal.");
       }
       else if(number[0]>number[4]){
          System.out.println("The first number is greater than the last number.");
       }
       else{
          System.out.println("The first number is smaller than the last number.");
       }

     
        input.close();
    }
}
