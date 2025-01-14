import java.util.Scanner;

public class Lowercase10{
	
	//method to checck two string is equal or not
	public static boolean compareTwoString(String s1,String s2){
		
		//if both char array has same length then only check
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
	
	//method to create character array
	public static String convertingLowercase(String s){
		String upper="";
	    for(int i=0;i<s.length();i++){
			if(s.charAt(i) >='A'&& s.charAt(i)<='Z'){
				
				upper=upper + (char)(s.charAt(i)+32);
			}else{
			    upper=upper+s.charAt(i);
			}
		}	
		return upper;
	}

    public static void main(String[] args){
	  
	 Scanner input=new Scanner(System.in);
     
	 //taking input from the user
	 System.out.println("Enter the String:");
	 String s=input.next();
	 
	 //converting uppercase tp lowercase character using user-defined method
	 String s1=convertingLowercase(s);
	 
	  //converting uppercase tp lowercase character using built-in method
	  String s2=s.toLowerCase();
	 
	 //comparing two string using method
	 boolean stringEqual=compareTwoString(s1,s2);
	
	 //displaying the result
	 if(stringEqual==true){
		 System.out.println("String Using User Defined method is: " + s1);
		 System.out.println("String Using Built-in method is: " + s2);
		 System.out.println("Both the strings are equal");
	 }else{
		  System.out.println("String Using User Defined method is: " + s1);
		 System.out.println("String Using Built-in method is: " + s2);
		 System.out.println("Both the Strings are not equal");
	 }
	 input.close();
	 
  }
}