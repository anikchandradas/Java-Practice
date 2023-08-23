package oop;

public class Employee {
	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	//Constructor
	Employee(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	
	/*
	void setdata(int id, String name, int sal, int dno) {
		empid = id;
		empname = name;
		salary = sal;
		deptno = dno;
	}
	*/
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	{
		//Assigning values to class variables using object
		/*
		Employee emp1 = new Employee();
		emp1.empid = 101;
		emp1.empname = "Anik Chandra Das";
		emp1.salary = 50000;
		emp1.deptno = 211;
		emp1.display();
		*/
		
		//Assigning values to class variables using method
		/*Employee emp1 = new Employee();
		emp1.setdata(201, "Rahul", 15000, 23);
		emp1.display();
		*/		
		
		//Assigning values to class variables using constructor
		Employee emp1 = new Employee(201, "Afrin Hossain", 25000, 230);
		emp1.display();
		
	}
}
