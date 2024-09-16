package Practices;

public class StudentMain {

	public static void main(String[] args) {
	
		
		//to store data in a class variables
		//1.using object reference variable
		
		//Student sc= new Student();
		/*sc.sid=100;
		sc.sname="John";
		sc.grade= 'A';
		sc.printStudentData();*/
		
		//2.using method 

		
		/*sc.setStudentData(101, "Rajesh",'B');
		sc.printStudentData();*/
		
		
		//using constructor
		
		Student sc1= new Student(102,"Mark",'C');
		sc1.printStudentData();
		
		
		

	}

}
