package conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		int a=3;
		if(a>0) 
		{
			System.out.println("Positive number.");
		}
		else if(a<0)
		{
			System.out.println("Negative number");
		}
		else if(a==0)
		{
			System.out.println("Number is Zero.");
		}
		else
		{
			System.out.println("Incorrect Input.");
		}
	}

}
