import java.util.Scanner;

public class FeesDiscountInput9{

	public static void main(String[] args){
		
                Scanner input =new Scanner(System.in);

                //taking input in fees variable
                System.out.println("Enter the fees");
		double fee = input.nextDouble();
		
                //taking input in discountPercentage variable
                System.out.println("Enter the discount Percentage");
		double discountPercentage = input.nextDouble();
		
                //calculating discount amount
		double discountAmount = fee / discountPercentage;
		
                //calculating discount price
		double discountedPrice = fee - discountAmount;
		
                //printing discount amount and discount price
		System.out.println("The discount amount is INR " + discountAmount + " and the final discounted fee is INR " + discountedPrice);

                input.close();
	}
}