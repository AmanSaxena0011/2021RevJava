package javaSessions;

public class Class1_DataTypes {

	public static void main(String[] args) {

		byte b = 102;
//		size = 1 byte;
//		Range = -128 to 127;
		System.out.println(b + 100);

		short s = 32000;
//		size = 2 byte;
//		Range = -32767 to 32768;
		System.out.println(s + b);

		int i = (byte) 2560;
//		size = 4 byte;
//		range = -2^31 to 2^31-1;
		System.out.println(i);

		long distance = 1234567l;
//		Size = 8 byte;
//		range = -2^63 to 2^63-1;
		System.out.println(distance);

		float dec = 12f;
//		size = 4 byte;
//		range = 6 decimal digits;
		System.out.println(dec);

		double d = 23.123456789012345675675765;
//		size= 8 byte;
//		range = 15 decimal digits;
		System.out.println(d);

		char c = (char) '2';
//		size = 1 byte;
		System.out.println(c + 20);

		boolean ba = (boolean) false;
		System.out.println(ba);

	}

}
