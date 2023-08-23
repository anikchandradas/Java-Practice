package string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Programming";
		
		//String Length
		System.out.println(s.length());
		
		//Concatenation
		String s1 = "Java";
		String s2 = " Programming.";
		
		System.out.println(s1 + s2);
		
		//Using concate method
		System.out.println(s1.concat(s2));
		
		//Equals
		String s3 = "Anik";
		String s4 = "anik";
		
		System.out.println(s3.equals(s4)); //false
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		String s5 = "Bangladesh";
		
		//Contains
		System.out.println(s5.contains("desh")); //true
		
		//Substring
		System.out.println(s5.substring(0, 3));
		System.out.println(s5.substring(2, 5));
		System.out.println(s5.substring(4, 7));
		
		String s6 = "Unik";
		
		//Replace
		System.out.println(s6.replace('U', 'A'));
		
		String s7 = "Java Programming";
		System.out.println(s7.replace("Java", "JavaScript"));
	}

}
