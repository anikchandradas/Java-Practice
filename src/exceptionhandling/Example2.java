package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		int a = 20;
		
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		/*
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}*/
		
		String st = "abcd";
		try {
			int i = Integer.parseInt(st);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int arr[] = new int[5];
			arr[10] = 100;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
