import java.util.Scanner;

public class StringCompare1{
	
	//method to check two string is equal or not
	public static boolean compareTwoString(String s1,String s2){
		
		//if both string has same length then only check
		 if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
			}
			return true;
			 
		 }
		 //else return false
		 return false;
		
	}

    public static void main(String[] args){
	  
	 Scanner input=new Scanner(System.in);
     
	 //taking input from the user
	 System.out.println("Enter the First String:");
	 String s1=input.next();
	 
	  //taking input from the user
	 System.out.println("Enter the Second String:");
	 String s2=input.next();
	 
	 //comparing two string using method
	 boolean stringEqual1=compareTwoString(s1,s2);
	 
	 //comparing two string using built-in-methods
	 boolean stringEqual2=s1.equals(s2);
	 
	 //displaying the result
	 if(stringEqual2==stringEqual1 && stringEqual1==true){
		 System.out.println("String 1 is: " + s1);
		 System.out.println("String 2 is: " + s2);
		 System.out.println("Both the strings are equal");
		 
	 }else{
		 System.out.println("String 1 is: " + s1);
		 System.out.println("String 2 is: " + s2);
		 System.out.println("Both the strings are not equal");
	 }
	 
	 input.close();
	 
  }
}