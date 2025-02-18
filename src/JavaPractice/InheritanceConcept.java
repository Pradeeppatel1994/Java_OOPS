package JavaPractice;

class A {
	int a = 100;

	void display() {
		System.out.println(a);
	}

}

class B extends A {
	int b = 200;

	void show() {
		System.out.println(b);
	}
}

class C extends B{
		int c=300;
		
		@Override
		void display() {
			System.out.println(c + " Overide");
		}
		
		void  power() {
			System.out.println("Power");
		}
}

public class InheritanceConcept {

	public static void main(String[] args) {

		//B bobj = new B();
		/*System.out.println(bobj.a);
		System.out.println(bobj.b);
		bobj.display();
		bobj.show(); */
		
		/*C cobj = new C();
		cobj.display();
		cobj.show(); */
	
		B bobj =new C();
		
		bobj.display();
		B bobj1 = new B();
		 
		bobj1.display();
		bobj1.show();
		
	}

}
