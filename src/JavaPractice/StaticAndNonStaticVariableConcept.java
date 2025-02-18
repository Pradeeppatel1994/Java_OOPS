package JavaPractice;

public class StaticAndNonStaticVariableConcept {
	
	String name="John";
	static int age=25;

	public void sendEmail() {
		System.out.println("Send Email Method");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}
	
	
	/*public static void main(String[] args) {
		
		//to call static varaible & Method
		
		//1.we can call directly
		
		//System.out.println(age);
		//sum();
		
		//2.BY using class name
		
		//StaticAndNonStaticVariableConcept.sum();
		//System.out.println(StaticAndNonStaticVariableConcept.age);
		
		
		//To Call Non static method and variable
		
		StaticAndNonStaticVariableConcept sc= new StaticAndNonStaticVariableConcept();
		
		System.out.println(sc.name);
		sc.sendEmail();
		
		
		
	}*/
	

}
