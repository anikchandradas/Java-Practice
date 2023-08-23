package oop;

public class ConstructorOverloading {

	int a = 0;
	int b = 0;
	double c = 0;
	
	//default constructor
	ConstructorOverloading(){
		a = 10;
		b = 20;
		c = 13.5;
	}
	
	//parameterized constructor
	ConstructorOverloading(int x, int y){
		a = x;
		b = y;
	}
	
	ConstructorOverloading(int x, int y, double z){
		a = x;
		b = y;
		c = z;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading();
		co.display();
		
		ConstructorOverloading co1 = new ConstructorOverloading(15, 5);
		co1.display();
		
		ConstructorOverloading co2 = new ConstructorOverloading(3, 6, 1.3);
		co2.display();
	}

}
