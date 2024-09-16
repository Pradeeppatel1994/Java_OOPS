package Practices;

public class Test {

	public static void main(String[] args) {
		MethodOverloadingConcept obj1 = new MethodOverloadingConcept();
		obj1.sum();
		obj1.sum(20);
		obj1.sum(20, 40);
		obj1.sum(1, null);
		obj1.sum(null, 10);

	}

}
