/* 
   1. Interface contains only static and final variable.
   2. In interface methods are by default public.
   3. In interface by default methods are abstract.
      	Abstract: a method have only definition but not implementation.
   4. We can not instantiate interface.
*/


package interfaces;

interface Box {
	int a = 10;
	void display();
}

public class InterfaceExample implements Box {
	
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		InterfaceExample ie = new InterfaceExample();
		ie.display();

	}

}
