package arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		System.out.println("Index\tValue");
		
		for(int i=0; i < a.length; i++)
		{
			System.out.println(i + "\t" + a[i]);
		}

	}

}
