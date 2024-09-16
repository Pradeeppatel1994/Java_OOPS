package Practices;

public class ConstructorMain {

	public static void main(String[] args) {

		/*
		 * ConstructorConcept obj = new ConstructorConcept(); ConstructorConcept obj1 =
		 * new ConstructorConcept(10); ConstructorConcept obj2 = new
		 * ConstructorConcept(10,30);
		 */

		ConstructorPractice obj = new ConstructorPractice("Pradeep", 30);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
