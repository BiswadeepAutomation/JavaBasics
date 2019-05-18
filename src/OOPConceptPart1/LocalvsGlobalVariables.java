package OOPConceptPart1;

public class LocalvsGlobalVariables {

	//Global or class variables
	String name = "Tom";
	int age = 25;
	
	
	public static void main(String[] args) {

		int i = 10; //local variable for main method
		System.out.println(i);
		
		// Cannot use global vars directly, object needs to be created to access global variables or non static functions		
		LocalvsGlobalVariables var = new LocalvsGlobalVariables();
		System.out.println(var.name);
		System.out.println(var.age);
		
		
		
	}
	
	public void sum() {
		int i=15; //local variable for sum method	
		int j=20; //local variables
		int age = 25; //local variables

	}

}
