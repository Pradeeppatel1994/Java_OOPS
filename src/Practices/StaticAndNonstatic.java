package Practices;

public class StaticAndNonstatic {

	String name = "John"; // Non static global variable
	int age = 33; // Non static global variable
	static String department = "Salesforce"; // static global variable

	public static void main(String[] args) {

		// sendEmail();
		StaticAndNonstatic.sendEmail();
		System.out.println(department);

		// to call non static method and global variable

		StaticAndNonstatic sn = new StaticAndNonstatic();
		sn.sum();
		System.out.println(sn.name);
		System.out.println(sn.age);

	}

	public static void sendEmail() {
		System.out.println("This is static method");

	}

	public void sum() {
		System.out.println("This is non static Method");
	}

}
