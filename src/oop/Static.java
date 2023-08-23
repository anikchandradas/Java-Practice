package oop;

public class Static {
	
	int a;        //non static
	static int b; //static
	
	static void m1() {
		System.out.println("This is Static method");
	}
	
	void m2() {
		System.out.println("This is Non-static method");
	}
	
	void m3() {	
		a = 12; // Non-static variable 
		b = 3;  // Static variable
		
		m1();  // Static Method
		m2();  //Non-Static Method
	}
	
	public static void main(String[] args) { //static method
		
		//static method can access static stuff only
		b = 100;
		System.out.println(b);
		m1();
		
		// a = 100; // Not accessible because this is not static variable
		// m2();    // Not accessible because this is not static method

		
		// Static method can also access non-static stuff through object
		Static se = new Static();
		se.a = 10;
		System.out.println(se.a);
		se.m2();
		
		// Non-static methods can access everything (static & non-static - direct access)
		se.m3();
	}

}
