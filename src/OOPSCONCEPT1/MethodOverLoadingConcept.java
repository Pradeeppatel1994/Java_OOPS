package OOPSCONCEPT1;

public class MethodOverLoadingConcept {

	public static void main(String[] args) {
		MethodOverLoadingConcept mlc = new MethodOverLoadingConcept();
		mlc.sum();
		mlc.sum(10);
		mlc.sum(10, 20);
		mlc.sum(10, null);

	}

	public void sum() {
		System.out.println("Zero input parameter"); // Zero input parameter
	}

	public void sum(int x) { // single input parameter
		System.out.println("Single Input parameter");
	}

	public void sum(int x, int y) { // double i/p parameter
		System.out.println("Doble input parameter");
	}

	public void sum(String s, int i) {
		System.out.println("Two input prameter with different data type");
	}

	public void sum(int i, String s) {
		System.out.println("2 i/p pram with diff param but change in sequence");
	}

}
