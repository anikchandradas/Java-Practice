package accessmodifiers;

class A {
	private int a = 10;
	
	void m1() {
		System.out.println(a);
	}
	
}

public class AccessModifiers {

	public static void main(String[] args) {
		
	A obj = new A(); 
	obj.m1();

	}

}
