package JavaPractice;

public class Car {
	String name;   //global/class variable
	int modal;
	int wheel;	
	
	public static void main(String[] args) {
		
		Car a= new Car();
		a.name="BMW";
		a.modal=2014;
		a.wheel=4;
		
		System.out.println(a.name+" "+a.modal+" "+a.wheel);
			
		Car b= new Car();
		b.name="CRETA";
		b.modal=2022;
		b.wheel=4;
		System.out.println(b.name+" "+b.modal+" "+b.wheel);
		

	}

}
