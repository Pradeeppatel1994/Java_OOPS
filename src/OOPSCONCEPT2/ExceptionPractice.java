package OOPSCONCEPT2;

public class ExceptionPractice {

	public static void main(String[] args) {

		// 1. Example

		/*
		 * try { int arr[]= {10,20,30,40,50,60}; System.out.println(arr[10]); }
		 * catch(Exception e) { System.out.println("Something went wrong"); }
		 */

		// 2.Example
		try {
			checkAge(15);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	
	public static void checkAge(int age) throws Exception {
		if(age<18) {
			throw new Exception("Access denied - You must be at least 18 years old.");
		}
		 else {
		      System.out.println("Access granted - You are old enough!");
		    }
	}

}
