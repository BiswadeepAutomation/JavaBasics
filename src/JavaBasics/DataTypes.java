package JavaBasics; 
//package is a Java keyword
//keyword should always start with lower case

public class DataTypes {
//public - access modifier
// class - java keyword	
	
	public static void main(String[] args) { 
//class body
//main method - starting or execution point
		
		
		
//Primitive DataTypes - int, double, char & boolean
		
	// 1. int - Integer
		int i = 10; 
			// i - variable, 10 - value
			//Variable should be unique
			//int i = 20 - gives error as i is already there.
		i = 20;
		System.out.println(i);
		
	//2, double - decimal
		double d1 = 12.33;
		double d2 = 110; //110.00
		//we can store integers in double but cannot store double in integer
		
	//3. char - character(Single digit value)
		char c1 = 'A';
		char c2 = '1'; //1 is not a integer, it is a character
		char c3 = '$';
		
	//4. Boolean
		boolean b1 = true;
		boolean b2 = false;
		
	//5. String is a class not a data type
		String s = "Good Morning";
		String s1 = "Welcome to Selenium";
		
		
		
	}

}
