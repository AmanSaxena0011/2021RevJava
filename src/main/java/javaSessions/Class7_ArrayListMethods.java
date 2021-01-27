package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Class7_ArrayListMethods {

	public static void main(String[] args) {

		String i[] = new String[3];
		i[0] = "Aman";
		i[1] = "Saxena";
		i[2] = "Bikas";

		for (String n : i) {
			System.out.println(n);
		}

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(i));
		System.out.println(ar);

		String str[] = new String[ar.size()];
		ar.toArray(str);

		for (String t : str) {
			System.out.println(t);
		}

	}

}
