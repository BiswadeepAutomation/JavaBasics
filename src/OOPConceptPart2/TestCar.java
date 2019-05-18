package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//Method Overriding
		
		//Static Polymorphism or compile time polymorphism (at the time of complilation java will decide which method to trigger)
		//Polymorphism is one to many which means method overriding 
		BMW b = new BMW();
		b.start(); 
		//when same methods are in parent and child class, child class method will take precedence.This is called method overriding. -
		// When same method is present in parent as well as child class with same name and same no of args is called method overriding
		//Preference is given to overridden method
		
		b.stop();
		b.acc();
		b.theft();
		b.engine(); // from vehicle class (grand parent class)
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.acc();
		
		
		System.out.println("*****Dynamic Polymorphism ****");
		//Dynamic Polymorphism or RUn time polymorphism
		//When child class object can be refered by parent class reference variable
		
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		
		
		
		
		
		
		
		
		
		
		
	}

}
