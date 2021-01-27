package javaSessions;

public class Class5_StaticArray {

	public static void main(String[] args) {

		int i[] = new int[4];
		int[] w = { 1, 2, 3, 4 };

		i[0] = 10;
//		i[1] = 20;
//		i[2] = 30;
//		i[3] = 40;

		System.out.println(i[0] + i[1]);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("-----");

		int k = 0;
		while (k < i.length) {
			System.out.println(i[k]);
			k++;
		}

		for (Integer ink : i) {
			System.out.println(ink);
		}

		Object o[] = new Object[3];

		o[0] = '1';
		o[1] = "Aman";
		o[2] = 123;

		for (Object on : o) {
			System.out.println(on);
		}

	}
}
