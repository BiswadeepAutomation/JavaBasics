package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {

	//+ is concatination operator
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 10.33;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b); //left to right exxecution
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);

		System.out.println(c+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);
		
		System.out.println("Hello World");
		System.out.println("The value of a is "+a);
		System.out.println("The sum of a+b is : "+(a+b));
		
		
	}

}
