public class CalculateProfitLoss4{
	
	public static void main(String[] args){
		
                //given cost price
		int costPrice = 129;
		
                //given selling price
		int sellingPrice = 191;
		
                // calculating profit with given selling and cost price
		int profit = sellingPrice - costPrice;
		
                //calculating profit percentage
		double profitPercentage = (double)profit / (double)costPrice * 100;
		
                //printing selling price, cost price, profit and profit percentage
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
		                   ".\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

	}
}