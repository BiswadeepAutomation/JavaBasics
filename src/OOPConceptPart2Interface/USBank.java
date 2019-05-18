package OOPConceptPart2Interface;

//only method declaration, that means no method body 
//in interface, we can declare the variables and variables are by default static in nature. variable value cannot be changed.
//no static methods are allowed in interface 
//no main method in interface
//abstract in nature (we cannot create objects of the interface)
//variables are static but methods are non static in nature

public interface USBank {
	
	int min_balance = 100;
	public void credit();
	public void debit();
	public void transferMoney();
	
	
	

}
