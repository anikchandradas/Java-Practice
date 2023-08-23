package oop;

public class UseOfThis {
	
	int id;
	String stuname;
	
	UseOfThis(int id, String stuname){
		this.id = id;
		this.stuname = stuname;
	}
	
	void display(){
		System.out.println("ID: " + id);
		System.out.println("Student Name: " + stuname + "\n");
	}
	
	public static void main(String[] args) {
		
		UseOfThis s1 = new UseOfThis(101, "Anik");
		UseOfThis s2 = new UseOfThis(102, "Dhiman");
		UseOfThis s3 = new UseOfThis(103, "Rahul");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
