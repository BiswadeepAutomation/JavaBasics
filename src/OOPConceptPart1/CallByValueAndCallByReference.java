package OOPConceptPart1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x=10;
		int y=20;
		obj.test(x, y); 	//Call By Value or Pass By Value
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

		
		
		
	}

	public int test(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	//call by reference - we are passing the value of object reference
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
		
		
	}

}
