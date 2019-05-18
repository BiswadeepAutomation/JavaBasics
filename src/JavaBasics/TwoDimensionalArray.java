package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {


		Object obj[][] = new Object [3][2];
		obj[0][0] = "Biswadeep";
		obj[0][1] = "Sahoo";
		obj[1][0] = "Ahaan";
		obj[1][1] = "Sahoo";		
		obj[2][0] = "Priyambada";
		obj[2][1] = "Behera";
		
		System.out.println(obj.length); //Will give rows
		System.out.println(obj[0].length); // Will give columns
		
		//How to print all values of 2D Array
		
		for (int x=0;x<obj.length;x++) {
			for (int y=0; y<obj[0].length; y++) {
				System.out.print(obj[x][y]);
				System.out.print(" ");
			}
			System.out.println();
		}
			
		
	}

}
