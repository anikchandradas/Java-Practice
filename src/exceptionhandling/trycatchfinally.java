package exceptionhandling;

public class trycatchfinally {

	public static void main(String[] args) {
		
		int a[] = new int[5]; //array index out of bound exception
		
		try {
			a[10] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is finally block.");
		}

	}

}
