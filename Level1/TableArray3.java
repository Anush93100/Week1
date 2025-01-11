import java.util.Scanner;

public class TableArray3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       //creating a variable named number;
         System.out.println("enter the number:");
         int number = input.nextInt();

       //declaring an array of size 10
       int table[]=new int[10];

       //calculating the table for given input number
       for(int i=0;i<10;i++){
           table[i] = number * (i+1); 
        }
        
       //printing the multiplication table 
       for(int i=1;i<=10;i++){
         System.out.println(number + " * " + i + " = " + table[i-1]);
      }
     
     
        input.close();
    }
}
