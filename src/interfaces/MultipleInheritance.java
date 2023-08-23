/* -> multiple inheritance can not achieve through class. 
   -> because one child should not have two parents.
   -> by using interface it is possible.
*/

package interfaces;

interface A {
	
	int a = 10;
	void display();
	
}

interface B {
	
	int b = 20;
	void show();
	
}


public class MultipleInheritance implements A, B {
	
	public void display() {
		System.out.println(a);
	}
	
	public void show() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.display();
		mi.show();

	}

}
