package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int i = 1;
		int j = i++; //post increment
		//first give the value of i to j and then increment the value of i
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int a = 1;
		int b = ++a; //pre increment
		// increase the value of a and then give the value to b
		System.out.println(a);
		System.out.println(b);
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int x = 2;
		int y = --x; //pre decrement
		System.out.println(x); //1
		System.out.println(y); //1

		
	}

}
