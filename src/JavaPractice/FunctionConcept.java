package JavaPractice;

public class FunctionConcept {

	public void test() // No Input,No Output
	{
		System.out.println("No Input,No Output");
	}

	public int pqr() { // No Input but some output

		System.out.println("No Input but some output");
		int a = 10;
		int b = 30;
		int sum = a + b;
		return sum;
	}

	public String qa() {
		System.out.println("QA Method");
		String Name = "Raju";
		return Name;
	}

	public int sum(int x, int y) { // Some I/p & O/p
		System.out.println("Some I/p & O/p");
		int add = x + y;
		return add;
	}

	public static void main(String[] args) {
		FunctionConcept fc = new FunctionConcept();
		fc.test();
		int x=fc.pqr();
		System.out.println(x);
		int y=fc.sum(40, 50);
		System.out.println(y);
		
		String a=fc.qa();
		System.out.println(a);
	}

}
