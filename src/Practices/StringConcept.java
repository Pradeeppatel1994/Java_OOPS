package Practices;

import java.util.Arrays;

public class StringConcept {

	public static void main(String[] args) {

		// String declaration
		// String s="welcome"; //first way
		// String s= new String("welcome"); // second way

		/*
		 * String s1 = "welcome"; String s2 = " to Java"; String s3 =
		 * " and Selenium Learn";
		 */

		// length
		/*
		 * System.out.println(s1.length()); System.out.println(s2.length());
		 */

		// concat()

		/*
		 * System.out.println(s1.concat(s2)); // welcome to Java
		 * System.out.println(s2.concat(s3)); // to Java and Selenium Learn
		 * 
		 * System.out.println(s1.concat(s2).concat(s3)); // welcome to Java and Selenium
		 * Learn
		 */

		// trim()-

		/*
		 * String s = "  Pradeep    ";
		 * 
		 * System.out.println(s.length()); // 13
		 * 
		 * System.out.println(s.trim()); // remove the spaces from left & right side of
		 * the string
		 * 
		 * System.out.println(s.trim().length()); // 7
		 */

		// cahrAt()

		/*
		 * String s="Pradeep Reddy";
		 * 
		 * System.out.println(s.charAt(3)); System.out.println(s.charAt(6));
		 * 
		 * System.out.println(s.length());
		 * 
		 * System.out.println(s.charAt(7));
		 */

		// contains()

		/*
		 * String s= "welcome";
		 * 
		 * System.out.println(s.contains("wel")); //true
		 * System.out.println(s.contains("come")); //true
		 * System.out.println(s.contentEquals("elc")); //false
		 * System.out.println(s.contains("ome")); //true
		 * System.out.println(s.contains("Wel")); //false
		 * System.out.println(s.contains("welme")); //false
		 */

		// equals(), equalsIgnoreCase()

		/*
		 * String s1="welcome"; String s2="Welcome"; String s3="welcome";
		 * 
		 * System.out.println(s1.equals(s2)); //false
		 * System.out.println(s1.equalsIgnoreCase(s2)); //true
		 * 
		 * System.out.println(s1.equals(s3)); //true
		 */

		// replace()

		/*String s = "Welcome to Selenium Java,Selenium Python, selenium c#";

		System.out.println(s.replace('e', 'a'));// Walcoma to Salanium Java,Salanium Python, Salanium c#
		System.out.println(s.replace("Selenium", "Cypress")); // Welcome to Cypress Java,Cypress Python, Cypress c#

		System.out.println(s.replace("Selenium", "Testing"));// Welcome to Testing Java,Testing Python, selenium c#
			
		System.out.println(s);*/
		
		
		//subString()
		
		/*String s="welcome";
		
		System.out.println(s.substring(0, 3));   //wel
		System.out.println(s.substring(3, 7));	 // come
		System.out.println(s.substring(1, 5));  //elco */
		
		
		// toUpperCase() & toLowerCase()
		
		/*String s1 ="welcome to Java";
		String s2="WELCOME TO SELENIUM";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase()); */
		
		
		//splite()
		
		
		//ex-1
		/*String s= "abc@gmail.com"  ;   // exp o/p --> abc  gmail.com
		
		String a[]=s.split("@"); // abc gmail.com
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));  // to print Arrays String  --> [abc, gmail.com] */
		
		//ex-2
		/*String amount ="$15,20,55";  // expected = 152055
		System.out.println(amount.replace('$', ' '));   			//15,20,55
		
		System.out.println(amount.replace('$', ' ').replace(',', ' '));    //  15 20 55 */
		
		
		//ex-3
		
		/*String s= "abc,123@xyz";     // exp o/p --> abc 123 xyz
		
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1));   // [abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));   // [123, xyz]
		
		System.out.println(arr1[0]);			//abc
		System.out.println(arr2[0]);			//123
		System.out.println(arr2[1]);			//xyz
		*/
		

		
	
		/*String str = "Geeks for Geeks";
        String[] arrOfStr = str.split(" ");
        
        System.out.println(Arrays.toString(arrOfStr));*/
		
		
        /*String str = "Geeks.for.Geeks";
        String[] arrOfStr= str.split("[.]");
        System.out.println(Arrays.toString(arrOfStr));*/
		
        String s= "abc@gmail.com"  ;   // exp o/p --> abc  gmail.com
		
		String a[]=s.split("@"); // abc gmail.com
		
		System.out.println(Arrays.toString(a));  //[abc, gmail.com]

		String a1[]=a[1].split("[.]");
		
		System.out.println(Arrays.toString(a1));
		
		/*for(String arr:a1) {
			System.out.println(arr);
		}*/
		
		
	}

}
