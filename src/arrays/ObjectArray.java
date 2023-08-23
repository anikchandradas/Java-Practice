package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		/*
		Object a[] = new Object[5];
		
		a[0] = 10; 		//integer
		a[1] = 25.52;	//double
		a[2] = "Anik";  //string
		a[3] = 'A';     //character
		a[4] = true;    //boolean
		*/
		
		Object a[] = {10, 25.34, "Anik", 'A', true};
		
		for(Object i : a) {
			System.out.println(i);
		}
	}

}
