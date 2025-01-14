import java.util.Scanner;

public class SubString2{
	
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
	
	//method to generate substring between specified indexes
	public static String generateSubString(String s1,int startIndex,int endIndex){
		
		//checking whether starting is less than end index or not
		if(startIndex<=endIndex){
		   String s2="";
		   for(int i=startIndex;i<endIndex;i++){
			   s2=s2+s1.charAt(i);
		   }
		   return s2;
		}
		//else return empty string
		return "";
	}

    public static void main(String[] args){
	  
	 Scanner input=new Scanner(System.in);
     
	 //taking input from the user
	 System.out.println("Enter the String:");
	 String s1=input.next();
	 
	  //taking input from the user
	 System.out.println("Enter the Starting index to generate subString(0 - " + s1.length()+ "):");
	 int startIndex=input.nextInt();
	 while(startIndex<0||startIndex>s1.length()){
		 System.out.println("Index number should be in a range between 0 - " + s1.length() + ":");
		 startIndex=input.nextInt();
	 }
	 
	  //taking input from the user
	 System.out.println("Enter the ending index to generate subString(0 - " + s1.length()+ "):");
	 int endIndex=input.nextInt();
	  while(endIndex<0||endIndex>s1.length()){
		 System.out.println("Index number should be in a range between 0 - " + s1.length() + ":");
		 endIndex=input.nextInt();
	 }
	 
	 //generating substring using methods
	 String subString1 = generateSubString(s1,startIndex,endIndex);
	 
	 //generating subString using built-in methods
	 String subString2 = s1.substring(startIndex,endIndex);
	 
	 //comparing two string using method
	 boolean stringEqual1=compareTwoString(subString1,subString2);
	 
	 //displaying the result
	 if(stringEqual1==true){
		 System.out.println("subString 1 using user defined method is: " + subString1);
		 System.out.println("subString 2 using built in method is: " + subString2);
		 System.out.println("Both the subStrings are equal");
		 
	 }else{
		 System.out.println("subString 1 using user defined method is: " + subString1);
		 System.out.println("subString 2 using built in method is: " + subString2);
		 System.out.println("Both the strings are not equal");
	 }
	 input.close();
	 
  }
}