package OOPS;

public class Employee {

	public boolean primeCheck(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int j = 2; j <= num / 2; j++)
				if (num % j == 0)
					return false;
		}
		return true;
	}

	public static void factorial(int n) {
		int fact = 1;
		for (int num = n; num >0; num--) {

			fact =  num*fact;
			
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		boolean b = obj.primeCheck(-11);
		System.out.println(b);
		
factorial(6);
obj.factorial(4);

	}

}
