package OOPS;

public class StringManupulation {	
	public static void main(String[] args) {
		
		String str = "Hi ThiS is Aman  123...";
	
System.out.println(str.length());
System.out.println(str.charAt(4));
System.out.println(str.indexOf('m'));
System.out.println(str.indexOf('i', str.indexOf('i')+1));
System.out.println(str.lastIndexOf('i'));
System.out.println(str.trim());
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.contains("Aman"));
System.out.println(str.replace('i', 'I'));
System.out.println(str.replaceAll("[^//d..0-9]", ""));
System.out.println(str.split(" ")[0]);
System.out.println(str.substring(3));
System.out.println(str.substring(2,8));
System.out.println(str.concat("concat"));
System.out.println(str.equals("Hi ThiS is Aman  123..."));
System.out.println(str.equalsIgnoreCase("Hi ThiS is AMAn  123..."));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
