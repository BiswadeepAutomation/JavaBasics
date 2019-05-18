package OOPConceptPart1;

public class MethodOverloading {

	//Method Overloading - when the method name is same with different arguements or input parameters within the same class
	//You cannot create a method inside a method
	public static void main(String[] args) {

		MethodOverloading ol = new MethodOverloading();
		ol.test();
		ol.test(5);
		ol.test(2,4);
		
		
	}
	
	public void test() {
		System.out.println("Test Method");
	}
	
	public void test(int x) {
		System.out.println("Test x");
		System.out.println(x);
	}
	
	public void test(int k,int x) {
		System.out.println("Test kx");
		System.out.println("Sum is "+(k+x));
	}

}
