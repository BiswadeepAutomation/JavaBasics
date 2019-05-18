package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		//array is to store similar data type values in a array variable
		
		
		//lowest bound/index = 0
		//highest bound/index = n-1 (n is size of array)
		//one dimensional array
		
		/*Disadvantages of array
		1. Size is fixed - static array
		2. similar data types */
		
		//1. int array
			int i[] = new int[4];
			i[0] = 2;
			i[1] = 4;
			i[2] = 6;
			i[3] = 8;
			
			int n = i.length; //size or length of array
			//System.out.println(n);
			
			//To print all the value of array, we have to use For Loop
			for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
			}
	
		  //2. double array
			double d[] = new double [3];
			d[0] = 10.43;
			d[1] = 50.55;
			d[2] = 44.22;
			
			System.out.println(d[2]);
			
		//3. char array
			char c[] = new char [2];
			c[0] = 's';
			c[1] = '4';
			
			System.out.println(c[1]);
			
		//4. boolean array
			boolean b[] = new boolean [2];
			b[0] = true;
			b[1] = false;
			
			System.out.println(b[0]);
			
		//5. String Array
			String s[] = new String[4];
			s[0] = "Biswadeep";
			s[1] = "Sahoo";
			s[2] = "Bangalore";
			s[3] ="India";
			
			System.out.println(s.length);
			for (int x =0; x< s.length;x++) {
				System.out.println(s[x]);
			}
	
	//To overcome the 1st disadvantage of size, we use collections - ArrayList, HashTable (Dynamic Array)
	//To overcome the 2nd disadvantage of similar data types, we use Object Array
	
		//6. Object Array - Object is a class and is used to store different data types
			Object obj[] = new Object[4];
			obj[0] = 'M';
			obj[1] = "Biswadeep";
			obj[2] = 35;
			obj[3] = 20.48;
					
			//System.out.println(obj[2]);
			for (int k =0; k< obj.length;k++) {
			System.out.println(obj[k]);
	}
	
	}

}
	
