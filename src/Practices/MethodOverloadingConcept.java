package Practices;

public class MethodOverloadingConcept {

	 public static void main(String[] args) {
	/*MethodOverloadingConcept obj = new
	 * MethodOverloadingConcept(); obj.sum(); obj.sum(10); obj.sum(10, 20);
	 * obj.sum(10, "Pradeep"); obj.sum("Manoj", 30);
	 */

	/*
	 * sum(); sum(10); sum(10,20); sum("Pradeep",30); sum("test",80);
	 * sum(140,"testqa");
	 */

	/*
	 * MethodOverloadingConcept.sum(); MethodOverloadingConcept.sum(10);
	 * MethodOverloadingConcept.sum(20, 50); MethodOverloadingConcept.sum(10, null);
	 * MethodOverloadingConcept.sum(null, 100);
	 */

	} 

	 void sum() {
		System.out.println("Test Method 1");
	}

	 void sum(int x) {
		System.out.println("Test Method 2");
	}

	 void sum(int x, int y) {
		System.out.println("Test Method 3");
	}

	 void sum(int x, String y) {
		System.out.println("Test Method 4");
	}

	  void sum(String y, int x) {
		System.out.println("Test Method 5");
	}
}
