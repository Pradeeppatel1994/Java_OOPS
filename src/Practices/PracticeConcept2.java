package Practices;

public class PracticeConcept2 {

	
	void test() {    //No i/P No O/P
		System.out.println("No Input & No Output");
	}
	
	int sum() {     // No i/p but some output
		System.out.println("No i/p but some output");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	String  qa() {    // no input but some output
		System.out.println("qa Method");
		String s="java";
		return s;
	}
	
	int divisoin(int x,int y) {   // some input and some output
		System.out.println("division method");
		int z=x/y;
		int s=x+y;
		return z;
		
	}
	
	
	public static void main(String[] args) {
			
		PracticeConcept2 pc = new PracticeConcept2();
		pc.test();
		String qa1=pc.qa();
		System.out.println(qa1);
		int add=pc.sum();
		System.out.println(add);
		
		
		int div1=pc.divisoin(20,10);
		System.out.println(div1);
	}

}
