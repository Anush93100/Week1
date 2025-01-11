import java.util.Scanner;

public class VoteArray1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       //declaring an array of size 10
       int age[]=new int[10];

      //taking input from the user
      for(int i=0;i<10;i++){
         System.out.println("Enter the age of student " + (i+1) + ". ");
         age[i]=input.nextInt();
      }

      //printing the result of whether the students can vote or not
      for(int i=0;i<10;i++){
        if(age[i]<0){
           System.out.println("Invalid age.");
        }
        else if(age[i]>=18){
           System.out.println("The student with age " + age[i] + " can vote.");
        }else{
            System.out.println("The student with age " + age[i] + " cannot vote.");
         }
      }

        input.close();
    }
}
