package JavaBasics;

public class IfElseComparionOperator {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		if (b>a){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("a is greater than b");
		}
		
		//Comparision Operators 
		// > < >= <= == !=
		
		int d = 10;
		int e = 10;
		
		if (d==e) {
			System.out.println("Value of d & e are equal");
		}else {
			System.out.println("Value of d & e are not equal");

		}
		
		// FInd the largest number 
		
		int x=200;
		int y=200;
		int z=200;
		
		if (x>y && x>z) {
			System.out.println("x is the largest number.");
		}else if(y>z){
			System.out.println("y is the largest number");
		}else {
			System.out.println("z is the largest number");
		}
			
		
		
	}

}
