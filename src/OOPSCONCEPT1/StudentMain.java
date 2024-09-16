package OOPSCONCEPT1;

public class StudentMain {

	public static void main(String[] args) {

		//Student s1 = new Student();

		// 1). Using Object Reference Variable
		/*
		 * s1.sid=101; s1.sname="Pradeep Patel"; s1.sgrade='A';
		 * 
		 * s1.pritnStudentData();
		 * 
		 * Student s2 = new Student(); s2.sid=102; s2.sname="Vinisha Kumari";
		 * s2.sgrade='A'; s2.pritnStudentData();
		 */

		// 2). using method.

		/*
		 * s1.setStudentData(103,"Peter England",'B'); s1.pritnStudentData();
		 */
		
		// 3).Using Constructor
		
		Student stu =new Student(104,"Mahesh",'B');
		stu.pritnStudentData();
		
		
	}

}
