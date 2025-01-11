public class FeesDiscount6{

	public static void main(String[] args){
		
                //given university fees
		int fee = 125000;
		
                //given discount percentage
		int discountPercentage = 10;
		
                //calculting discount amount
		int discountAmount = fee / discountPercentage;
		
                //calculting discount price
		int discountedPrice = fee - discountAmount;
		
                //printing discount amount and discount price
		System.out.println("The discount amount is INR " + discountAmount + " and the final dicounted fee is INR " + discountedPrice);
	}
}