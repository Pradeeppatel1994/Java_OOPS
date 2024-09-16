package OOPSCONCEPT2;

public class ExceptionHandeling {
//		int a=10;
//		static ExceptionHandeling obj;
	public static void main(String[] args) {

		// Uncaught Exception
		// int i=9/0;
		// System.out.println(i);

		// caught Exception
		// Thread.sleep(2000);

		// ExceptionHandeling obj = new ExceptionHandeling();
		// obj =null;
		// System.out.println(obj.a);

		// 1. try-catch block

		try {
			int i = 9 / 0; // this code will throw an exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");

	}

}
