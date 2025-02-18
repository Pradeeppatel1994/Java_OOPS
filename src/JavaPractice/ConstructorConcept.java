package JavaPractice;

public class ConstructorConcept {
	
	String name;
	int age;
	
	ConstructorConcept(){
		System.out.println("Default Constructor");
	}
	
	ConstructorConcept(int i){
		System.out.println("1 Param. Constructor");
		System.out.println(i);
	}
	
	ConstructorConcept(int j,int k){
		System.out.println("2 Param. Constructor");
		System.out.println(j);
		System.out.println(k);
	}
	
	ConstructorConcept(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept  cc= new ConstructorConcept();
		ConstructorConcept cc1= new ConstructorConcept(10);
		ConstructorConcept cc2 =new ConstructorConcept(20,40);
		ConstructorConcept cc3 = new ConstructorConcept("Ramesh",45);
		
		System.out.println(cc3.name);
		System.out.println(cc3.age);

	}

}
