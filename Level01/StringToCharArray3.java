import java.util.Scanner;

public class StringToCharArray3{
	
	//method to check two string is equal or not
	public static boolean compareTwoCharArray(char[] s1,char[] s2){
		
		//if both char array has same length then only check
		 if(s1.length==s2.length){
			for(int i=0;i<s1.length;i++){
				if(s1[i]!=s2[i]){
					return false;
				}
			}
			return true;
			 
		 }
		 //else return false
		 return false;
		
	}
	
	//method to create character array
	public static char[] creatingCharArray(String s){
		
		//declaring the character array of size string length
		char[] charArray=new char[s.length()];
		
		//copying string value to character array
		for(int i=0;i<s.length();i++){
			
			charArray[i]=s.charAt(i);
		}
		//returning avar array
		return charArray;
		
	}

    public static void main(String[] args){
	  
	 Scanner input=new Scanner(System.in);
     
	 //taking input from the user
	 System.out.println("Enter the String:");
	 String s1=input.next();
	 
	 //converting string into character array using user-defined method
	 char[] charArray1=creatingCharArray(s1);
	 
	  //converting string into character array using built-in method
	 char[] charArray2=s1.toCharArray();
	 
	 //comparing two string using method
	 boolean stringEqual=compareTwoCharArray(charArray1,charArray2);
	
	 //displaying the result
	  System.out.print("Char Array 1 is: ");
	  for(int i=0;i<charArray1.length;i++){
		  System.out.print(charArray1[i] + " ");
	  }
	  
	  System.out.print("\nChar Array 2 is: ");
	  for(int i=0;i<charArray2.length;i++){
		  System.out.print(charArray2[i] + " ");
	  }
	  
	 if(stringEqual==true){
		 System.out.println("\nBoth the Char Arrays are equal");
	 }else{
		 System.out.println("\nBoth the Char Arrays are not equal");
	 }
	 input.close();
	 
  }
}