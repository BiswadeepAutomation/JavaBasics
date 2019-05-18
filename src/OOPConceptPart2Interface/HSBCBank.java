package OOPConceptPart2Interface;

public class HSBCBank implements USBank, BrazilBank { // we acheived multiple inheritence (Is a Relationship)

	@Override
	public void credit() {
		System.out.println("HSBC credit card charges annually");
	}

	@Override
	public void debit() {
		System.out.println("HSBC to debit interest annually");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC allows three time transfer monthly");
		
	}
	
	public void educationLoan() {
		System.out.println("Provide education loan");
	}
	
	public void carLoan() {
		System.out.println("Provide car loan");
	}


	@Override
	public void mutualFund() {
		System.out.println("HSBC Mutual Fund schemes");
	}

}
