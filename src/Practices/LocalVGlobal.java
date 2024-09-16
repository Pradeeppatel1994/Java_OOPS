package Practices;

public class LocalVGlobal {
	
	
	String name="Pradeep";
	int age=30;
	
	public static void main(String[] args) {
	
		LocalVGlobal lg = new LocalVGlobal();
		System.out.println(lg.name);
		System.out.println(lg.age);
		lg.variable();

	}
	public void variable() {
		int i=15;
		int j=20;
		LocalVGlobal lg = new LocalVGlobal();
		System.out.println("Scope of Global Variable ="+lg.name);
	}
	
	
	
	
}
