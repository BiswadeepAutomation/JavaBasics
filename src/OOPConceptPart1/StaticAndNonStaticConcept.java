package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	//global vars : scope - will be accessible across all the functions with some conditions(static / non static way)
	
	
	
	String name = "Tom"; //non static global variable
	static int age = 25; //static global variable
	
	
	
	public static void main(String[] args) {
	
		
		//how to call static methods or varibales
		//1. Call directly
		sum();
		System.out.println(age);
		//2. Call by class name
		StaticAndNonStaticConcept.sum();
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods & variables
		//create object and then call the varibales/functions
		StaticAndNonStaticConcept st = new StaticAndNonStaticConcept();
		st.sendMail();
		st.sum(); //warning is guven that static method should be accessed in static way 
		
		
	}

	public void sendMail() { //non static method
		System.out.println("Sending mail");
	}
	
	public static void sum() { //static method
		System.out.println("Sum method");
	}
	
	
}
