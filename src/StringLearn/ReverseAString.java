package StringLearn;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Approach 1-using String methods- length(),charAt()
		
		
		/*String s="welcome";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string s:"+rev);
		*/
		
		//Approach 2-Without using string method,by converting string to char array type
		
		/*String s ="selenium";
		String rev ="";
		
		char a[]=s.toCharArray();      //to convert string in to char array
		
		for(int i =a.length-1;i>=0;i--) {
			
			rev= rev+a[i];
		}
		
		System.out.println("Reverse String s is:"+rev); */
		
		
		
		//***********Approach 3.Using StringBuffer class*************
		
		/*StringBuffer s= new StringBuffer("Selenium");
		System.out.println("Reverse String s:"+s.reverse());*/
		
		

		//***********Approach 4.Using StringBuilder class*************
		
		StringBuilder s= new StringBuilder("Welecome");
		System.out.println("Reverse String s:"+s.reverse());
		
		
		
		
	}

}
