package OOPConceptPart1;

//ObjectCreation&ChangingReferences

public class Car {
	
	//Global or class variables
	
	int mod;
	int wheels;
	
	

	public static void main(String[] args) {
		
		//new is used to create an object
		//--new car - this is the object of car class
		//a,b,c - Object Reference Variables

		Car a = new Car(); //RHS is called Object, a is referring to that object so a is object reference variable
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2016; 
		a.wheels = 4;
		
		b.mod = 2018;
		b.wheels = 4;
		
		c.mod = 2019;
		c.wheels = 4;
		
		System.out.println("Before changing the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheels);
		
		System.out.println(b.mod);
		System.out.println(b.wheels);
		
		System.out.println(c.mod);
		System.out.println(c.wheels);
		
		System.out.println("After changing the reference");
		a=b;
		b=c;
		c=a;
		
		a.mod = 20;
		System.out.println(a.mod);
		c.mod=30;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		System.out.println(b.mod);
		
		
		//When there is no object being refered by any object reference variable, it is termed as garbage collection
		
	}
	
	

}
