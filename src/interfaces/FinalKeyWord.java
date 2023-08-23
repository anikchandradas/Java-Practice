//Final variable --> the value of variable is constant (we can not change)
//Final method   --> method we can not override in the child class
//Final Class    --> class can not be extend

package interfaces;

final class Test {
	
	final int a = 10;
	
	final void m1() {
		//a = 5; // we can not modify because it is a final variable
		System.out.println(a);
	}
}

//final class can not be extend
/*
class Test1 extends Test {
	
	
	void m1() {
		System.out.println("m1 is overriden."); // we can not override
	}
	
}
*/

public class FinalKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
