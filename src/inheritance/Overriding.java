//Example of method overriding
//And example of Hierarchy inheritance

package inheritance;

class Bank {
	
	int getRateOfInterest(){
		return 0;
	}
}

class SCB extends Bank {
	
	@Override
	int getRateOfInterest() {
		return 10;
	}
}

class Dhaka extends Bank {
	
	@Override
	int getRateOfInterest() {
		return 15;
	}
}

class UCB extends Bank {
	
	@Override
	int getRateOfInterest() {
		return 7;
	}
}


public class Overriding {

	public static void main(String[] args) {
		
		SCB p1 = new SCB();
		System.out.println(p1.getRateOfInterest());
		
		Dhaka p2 = new Dhaka();
		System.out.println(p2.getRateOfInterest());
		
		UCB p3 = new UCB();
		System.out.println(p3.getRateOfInterest());

	}

}
