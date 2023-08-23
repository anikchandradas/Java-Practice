//Single Level inheritance

package inheritance;

class A {
	
	int a;
	int b;
	
	public void display() {
		System.out.println("Class A " + (a+b));
	}
}

class B extends A{
	int x;
	int y;
	
	public void show() {
		System.out.println("Class B " + (x+y)); 
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		B objectb = new B();
		objectb.a = 12;
		objectb.b = 32;
		objectb.display();
		
		objectb.x = 4;
		objectb.y = 76;
		objectb.show();

	}

}
