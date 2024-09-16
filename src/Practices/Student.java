package Practices;

public class Student {

	int sid;
	String sname;
	char grade;

	void printStudentData() {
		System.out.println(sid + "   " + sname + "   " + grade + "   ");
	}

	void setStudentData(int id, String name, char gd) { // to set the data for the global variables
		sid = id;
		sname = name;
		grade = gd;

	}

	Student(int id, String name, char gd) {
		sid = id;
		sname = name;
		grade = gd;

	}

}
