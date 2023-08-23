//Multilevel inheritance

package inheritance;

class X {
	
	int a;
	int b;
	
	public void display() {
		System.out.println("Class X " + (a+b));
	}
}

class Y extends X{
	int x;
	int y;
	
	public void show() {
		System.out.println("Class Y " + (x+y)); 
	}
}

class Z extends Y {
	int p;
	int q;
	
	public void add() {
		System.out.println("Class Z " + (p+q));
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Z obj = new Z();
		obj.a = 10;
		obj.b = 20;
		obj.x = 16;
		obj.y = 4;
		obj.p = 7;
		obj.q = 3;
		
		obj.display();
		obj.show();
		obj.add();

	}

}
