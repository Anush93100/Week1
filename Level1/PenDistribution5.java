public class PenDistribution5{
	public static void main(String[] args){
	    
           //given pens
	   int pens = 14;
	    
           //given number of student
	   int students = 3;
	   
           // calculating distribution of pen
	   int distributed = pens / students;
	   
           //calculating remaining student
	   int remaining = pens % students;
	
           //printing pen distribution and remaining students
	   System.out.println("The Pen per student is " + distributed + " and the  remaining pen not distributed is " + remaining);
	
	}
}