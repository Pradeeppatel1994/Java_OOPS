package OOPSCONCEPT2;

public class ExceptionConcept {

	public static void test() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) {
		try {
			test();
			System.out.println("This is try block");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("This is Catch Block ");
		}

	}

}
