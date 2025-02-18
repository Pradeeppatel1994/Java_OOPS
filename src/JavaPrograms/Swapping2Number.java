package JavaPrograms;

public class Swapping2Number {

	public static void main(String[] args) {
		
		//Swap 2 number using third variable

		/*int a = 20, b = 10;

		System.out.println("Before Swapping values are..." + a + " " + b);

		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping values are..." + a + " " + b);
		 */
		
		// Without using third variable --> using + and - operators
		
		/*int a = 20, b = 10;
		System.out.println("Before Swapping values are..." + a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping values are..." + a + " " + b);
		*/
		
		// Without using third variable --> using * and / operators and a and b should not be zero 0. 
		
				/*int a = 20, b = 10;
				System.out.println("Before Swapping values are..." + a + " " + b);
				a=a*b;
				b=a/b;
				a=a/b;
				
				System.out.println("After Swapping values are..." + a + " " + b);*/
		
		//Using single statement
		int a = 20, b = 10;
		System.out.println("Before Swapping values are..." + a + " " + b);
		b=a+b-(a=b);
		
		System.out.println("After Swapping values are..." + a + " " + b);		
		
	}

}
