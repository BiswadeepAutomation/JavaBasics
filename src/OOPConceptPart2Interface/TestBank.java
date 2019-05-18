package OOPConceptPart2Interface;

public class TestBank {

	public static void main(String[] args) {

		//Compile Time Polymorphism or static polymorphism
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//Dynamic or RUn Time Polymorphism
		//child class object can be refered by parent interface reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//b.educationLoan(); -- cannot be accessed, only over ridden methods will be called
		
		
		//How to access variables
		//System.out.println(min_balance); You have to either call with class or interface name
		System.out.println(USBank.min_balance);
		System.out.println(HSBCBank.min_balance);

		//min_balance=200; 
		//we cannot change the value as it is defined in the interface class
		
	}

}
