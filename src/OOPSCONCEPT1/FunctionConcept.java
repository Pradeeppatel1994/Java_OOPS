package OOPSCONCEPT1;

public class FunctionConcept {

	public static void main(String[] args) {
		FunctionConcept fc =new FunctionConcept();
		fc.test();
		int result=fc.sum();
		System.out.println(result);
		int a=fc.add(10, 20);
		System.out.println(a);
		
		

	}
	
	public void test() {   // No i/p no o/p
		System.out.println("No Input,No Output");
	}
	
	public int  sum() {            //No input but some output
		int a=10,b=10;
		int c=a+b;
		System.out.println("sum method");
		return c;
	}
	
	public String pqr() {
		String s= "Pradeep Patel";
		return s;
	}
	
	
	public int add(int x,int y) {         //some input and some output
		System.out.println("add method");
		int z=x+y;
		return z;
	}
	
	
	

}
