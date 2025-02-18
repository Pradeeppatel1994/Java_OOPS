package JavaPractice;

public class Adder {

	public static void main(String[] args) {
		
		Adder add = new Adder();
		add.sum();
		add.sum(10,5);
		add.sum(10,"sum");
		add.sum("Sum", 20);
		add.sum(10, 20, 40);
		
	}

	
	void sum() {							//1
		System.out.println("No Parameter");
	}
	
	void sum(int a,int b) {                  // 2 Parameter
		System.out.println(a+b);        
	}
	 
	void sum(int a,String b) {
		System.out.println("2 parameters but diffeent data type ");   //3.2 parameter but  different data type 
	}
	
	
	void sum (String b,int a) {
		System.out.println("Order of parameters different");  //4. Order of parameter different
	}
	
	
	void sum(int a, int b,int c) {								//5.Number of parameters are different
		System.out.println("Number of parameters are different ");
	}
}
