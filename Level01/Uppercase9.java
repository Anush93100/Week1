import java.util.Scanner;

public class Uppercase9{
	
	//method to check two string is equal or not
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
	public static String convertingUppercase(String s){
		String upper="";
	    for(int i=0;i<s.length();i++){
			if(s.charAt(i) >='a'&& s.charAt(i)<='z'){
				
				upper=upper + (char)(s.charAt(i)-32);
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
	 
	 //converting lowercase to uppercase character using user-defined method
	 String s1=convertingUppercase(s);
	 
	  //converting lowercase to uppercase character using built-in method
	  String s2=s.toUpperCase();
	 
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
		 System.out.println("Both the String are not equal");
	 }
	 input.close();
	 
  }
}