package Practices;

public class ReverseString {

	public static void main(String[] args) {
		
		// using length() & charAt()
		
		String s="welcome";    // exp o/p --> emoclew
		
		String resv=" ";
		for(int i=s.length()-1;i>=0;i--) {
			resv= resv+s.charAt(i);
		}
		
		System.out.println(resv);

	}

}
