package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {

		//1. While Loop
		//Declare a variable
		int i=1; // initialization
		while (i<=10) { //condition
			System.out.println(i);
			//i = i+1;
			i++; // incremental or decremental i++ = i+1
		}
		
		//Disadvantage - It will generate infinite loop if you don't provide incremental or decremental part
		System.out.println("************************");
		
		//2. For Loop
		
		for (int j=1;j<=10;j++) { //initialization; condition; incremental or decremental
			System.out.println(j);
		}
		
		System.out.println("************************");		
		
		for (int r=10;r>=-10;r--) {
			System.out.println(r);
		}
		
		
		
		
	}

}
