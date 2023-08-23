package oop;

public class Calculation {
	
	int a;
	int b;
	
	//Method without parameter
	void sum() {
		System.out.println(a+b);
	}
	
	//Method takes parameters
	void sub(int x, int y) {
		a = x;
		b = y;
		System.out.println(a-b);
	}
	
	//Method returning some value
	int mul(int x, int y) {
		a=x;
		b=y;
		return (a*b);
	}
	
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		cal.a = 24;
		cal.b = 4;
		
		cal.sum();
		
		cal.sub(30, 15);
		
		int res = cal.mul(4, 2);
		System.out.println(res);

	}

}
