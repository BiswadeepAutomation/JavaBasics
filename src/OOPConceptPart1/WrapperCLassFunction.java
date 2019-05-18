package OOPConceptPart1;

public class WrapperCLassFunction {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);//10020
		
		//Integer is a wrapper class
		//Data conversion from String to Integer
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(x+20);//120

		//INteger, Double, Character, Boolean
		
		//Double Wrapper Class
		String y="12.25";
		System.out.println(y+10);//12.2510
		double d = 	Double.parseDouble(y);
		System.out.println(d+10);//22.25
		
		//Boolean Wrapper CLass
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to String Conversion
		int j = 200;
		System.out.println(j+20);//220
		String s = String.valueOf(j);
		System.out.println(s+100);//20100
		

		
		
	}

}
