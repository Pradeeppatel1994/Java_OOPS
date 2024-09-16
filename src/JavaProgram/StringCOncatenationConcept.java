package JavaProgram;

public class StringCOncatenationConcept {

	public static void main(String[] args) {
	
		int i=100;
		String s1="Hello";
		String s2="World";
		int j=40;
		System.out.println(i+j+s1+s2); // 140HelloWorld
		System.out.println((i+j)+s1+s2); // 140HelloWorld
		System.out.println(i+j+(s1+s2));  //140HelloWorld
		System.out.println(s1+s2+i+j);//HelloWorld10040
		System.out.println(s1+s2+(i+j)); //HelloWorld140
		
		

	}

}
