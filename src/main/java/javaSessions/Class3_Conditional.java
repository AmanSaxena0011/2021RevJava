package javaSessions;

public class Class3_Conditional {

	public static void main(String[] args) {

//		int a = 170, b = 20, c = 30, d = 40;
//
//		if (a > b) {
//			System.out.println("a is greater than b by: " + (a - b));
//		}
//
//		else {
//			System.out.println("b is greater than a by: " + (b - a));
//		}

		String browser = "Chrome";
		if (browser == "Chrome") {
			System.out.println("It is chrome");
		}
		boolean v = false;
		if (!v) {
			System.out.println("Hiii....!!!!!!!");
		}

		System.out.println("---------");

//	WAP to check highest number 
		int a = 10, b = 5, c = 20;

		if (a > b && a > c) {
			System.out.println("a is highest");
		} else if (b > c) {
			System.out.println("b is highest");
		} else {
			System.out.println("c is highest");
		}

//	Switch case statement:

		int num = 3;
		switch ("browsers") {
		case "browsers":
			System.out.println("Value 1");
			break;

		case "a":
			System.out.println("Value 2");
			break;
		case "ads":
			System.out.println("Value 3");
			break;
		case "dsds":
			System.out.println("Value 4");
			break;

		default:
			System.out.println("No match");
			break;
		}

//		SWAP
		int n1 = 20;
		int n2 = -31;

		n1 = n1 ^ n2;// 600
		n2 = n1 ^ n2;// 20
		n1 = n1 ^ n2;// 30

		System.out.println(n1 + " " + n2);
// EVEN ODD
		if (n1 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
