package _03_numbers;

public class _03_demo_challenge {

	public static void main(String[] args) {
//A woman wins money as a casino
		double moneyWinnings = 10000.00;
				
//she decised to go shopping and buys the following
		double usedCar = 7000.00;
		double newMakeup = 547.00;
		double newPhone = 860.00;
		
//		The bill is calculated
		double shoppingTotalBill = usedCar + newMakeup + newPhone;
//		We need to print our total
		System.out.println("Shopping Bill: " + shoppingTotalBill);

//		the bank ballence is calculated
		double afterShoppingBalence = moneyWinnings - shoppingTotalBill;
		System.out.println("Bank Ballence: " + afterShoppingBalence);
		
//		stress the importance of changing this value
		moneyWinnings = afterShoppingBalence;
		
//She puts half of the money in her bank account
		afterShoppingBalence = afterShoppingBalence / 2;
		System.out.println("Savings Account: " + afterShoppingBalence);
		
//		she has to pay rent
		double payRent = 760.50;
		
		afterShoppingBalence = afterShoppingBalence - payRent;
		System.out.println("After Paying Rent: " + afterShoppingBalence);
		
	//TODO play with this tonight and practice	
		
	}
}
