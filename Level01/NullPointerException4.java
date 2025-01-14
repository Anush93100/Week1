
public class NullPointerException4{
	
	//method to generate exception
	public static void generatingException(){
		
		//declaring a variable and initializing it NULL 
		String s=null;
		
		//calling built-in methods in this null variable to generate exception
		 System.out.println("Length of String is: " );
			 System.out.println( s.length());
	}
	
	//method to handle exception using try catch 
	public static void handlingException(){
		
		try{
			//declaring a variable and initializing it NULL 
		    String s=null;
		
		    //calling built-in methods in this null variable to generate exception
		    System.out.println("Length of String is: " );
			 System.out.println( s.length());
			
		}catch(NullPointerException e){
			 System.out.println("Null Pointer Exception caught  => " + e.getMessage() );
		}
		 
	}
	
	

    public static void main(String[] args){
	  
	
     try{
	  System.out.println("Calling method to generate NullPointerException: ");
      generatingException();
	 }catch(NullPointerException e){
		//System.out.println(e.getMessage() );
		e.printStackTrace();
	 }
	 
	 System.out.println("Calling method to handle NullPointerException: ");
	 handlingException();
	 
	 
  }
}