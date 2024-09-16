package OOPSCONCEPT1;

public class LocalandGlobalVaribaleConcept {
		 String name="John";   // Global Variable or class variable
		 int age =22; 
	
	public static void main(String[] args) {
		int a =10;
		
		LocalandGlobalVaribaleConcept lg = new LocalandGlobalVaribaleConcept();
		
		System.out.println(lg.name);
		System.out.println(lg.age);
		System.out.println(a);
		
	}
	
	public void variable() {   
		int i=10;   //Local Variables
		int j=20;
	}

}
