package StringLearn;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		
		//String-immutable
		
		/*String s ="welcome";
		s.concat("to java");
		System.out.println(s);      //immutable, cannot change original value of s.
		*/
		
		
		//StringBuffer -mutable
		
		/*StringBuffer sbf=new StringBuffer("Selenium");
		sbf.append(" Learn");
		System.out.println(sbf);    //mutable, we can change original value of s.
		*/
		
		
		//StringBuilder - mutable
		
		StringBuilder sb=new StringBuilder("Selenium");
		sb.append(" Learn");
		System.out.println(sb);    //mutanle, we can change original value of s.
		
		
		
	}

}
