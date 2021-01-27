
package OOPS;

public class DataConversion {

	public static void main(String[] args) {
		
		
		String str  = "100";
		
		int a = Integer.parseInt(str);
		double d =	Double.parseDouble(str);
		byte b = Byte.parseByte(str);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(b);
		
		String s = String.valueOf(a);
		System.out.println(s);

	}

}
