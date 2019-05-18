package OOPConceptPart1;
//Functions and Methods are same thing (Like a factory)
//There is just one main method
//You have to create an object to call non static methods (VERY IMPORTANT)
//We never write return statement inside the main method so it is void
public class FunctionsInJava {

	public static void main(String[] args) {
			
		FunctionsInJava fun = new FunctionsInJava();
		//one object will be created and fun is the reference variable referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
		
		fun.abc();
		fun.test();
		
		String s1 = fun.qa(); // s1 will store the return value
		System.out.println(s1);
		
		int d1 = fun.division(10, 2);
		System.out.println(d1);
		
		
		
	}

	
	//Non static methods
	//1. No input and no output
	//return type - void
	//void means does not return any value
    public void test() {
    	System.out.println("Test Method");
    	
    }
    
	//2a. No input and some output
    //return type - int
    public int abc() { //removed void and aded data type (return type of the method)
    	System.out.println("ABC Method");
    	int a = 10;
    	int b = 20;
    	int c = a+b;
    	System.out.println(c);
    	return c;
    }
    
    //2b. No input and some output
    //return type - String
    public String qa() {
    	System.out.println("QA Method");
    	String s = "Selenium";
    	
    	return s;    	   
    }
    	
	//3. Some input and some output
    //input arguements or parameters
    //return type - int
    public int division(int x, int y) {
    	System.out.println("Division Method");
    	int d = x/y;
    	//System.out.println(d);
    	return d;
    	
    }
	
}
