package OOPSCONCEPT1;

public class Student {

	// Global Variable initialization using object reference variables

	int sid;
	String sname;
	char sgrade;

	void pritnStudentData() {
		System.out.println(sid + "  " + sname + "  " + sgrade);
	}

	void setStudentData(int id, String name, char grade) {
		sid = id;
		sname = name;
		sgrade = grade;
	}
	
	Student(int id, String name, char grade){  //Constructor 
		sid = id;
		sname = name;
		sgrade = grade;
	}

}
