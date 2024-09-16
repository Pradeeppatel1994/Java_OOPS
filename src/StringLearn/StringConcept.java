package StringLearn;

import java.util.Arrays;

public class StringConcept {

	public static void main(String[] args) {
	
//		String s ="welcome";
//		System.out.println(s);
		
//		String s = new String("welcome");
//		System.out.println(s);
		
		//1.length()-return length of a String (No. of character)
		String s ="welcome";
		System.out.println(s.length());      //7
		System.out.println("welcome".length()); //7
		
		//2.concat() -joining string 
		
		String s1 = "welcome";
		String s2 = "to java";
		String s3 ="Automation";
		
		
		System.out.println(s1+s2);   // using + operator we can achieve, concatenation  --> welcometo java
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1+s2+s3);  //welcometo javaAutomation
		System.out.println(s1.concat(s2).concat(s3)); //welcometo javaAutomation
		System.out.println(s1.concat(s2)+s3); // welcometo javaAutomation
		
		
		System.out.println("welcome"+"to java"); // welcometo java
		System.out.println("Welcome".concat("to java")); //Welcometo java

		
		//3.trim()  --> remove spaces right and left side.
		
		s="   Welcome   ";
		
		System.out.println(s);  // print string along with spaces
		System.out.println("Before trimming:"+s.length());
		
		
		System.out.println(s.trim());
		System.out.println("After trimmed"+s.trim().length());
		
		
		//4.charAt()-  return a character from string based on index.
		
		String name ="Pradeep";
		System.out.println(name.charAt(3));  //d
		System.out.println(name.charAt(0));	//p
		
		//5.contains()-> return only true/false
		//check string is part of main string or not.
		
		System.out.println(name.contains("Pra")); //true
		System.out.println(name.contains("deep"));//true
		System.out.println(name.contains("pra")); //false
		System.out.println(name.contains("DEEP"));//false
		System.out.println(name.contains("praeep"));//false
		
		System.out.println("**********************************");
		
		//6.equals(), equalsIgnoreCase() --> both are used to compare String
		s1="welcome";
		s2="welcome";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2); //true
		System.out.println(s1.equals("Welcome"));//False
		System.out.println(s1.equalsIgnoreCase("Welcome")); //true
		
		System.out.println("**********************************");
		
		//7.replace()-replace single/multiple(sequence) of character in a string.
		s="welcome to selenium java selenium pyton selenium java c#";
		System.out.println(s.replace('e', 'x')); //wxlcomx to sxlxnium java sxlxnium pyton sxlxnium java c#
		
		System.out.println(s.replace("selenium","cypress"));//welcome to cypress java cypress pyton cypress java c#
		
		System.out.println("**********************************");
		
		//8.substring()- extract substring from the main string
		//starting index -0
		//ending index-1
		
		s="selenium";
		System.out.println(s.substring(1, 5));//elen
		System.out.println(s.substring(1, 4)); //ele
		
		System.out.println("**********************************");
		
		//9.toUpperCase(), toLowerCase()
		
		s="Welcome";
		System.out.println(s.toUpperCase());   //WELCOME
		System.out.println(s.toLowerCase());  //welcome
		
		System.out.println("**********************************");
		
		//10.splite()-
		
		//ex-1
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);  //abc
		System.out.println(a[1]);	//gmail.com
		System.out.println(Arrays.toString(a)); //[abc, gmail.com]
		
		//ex-2
		
		String amount ="$15,20,55";  // expected = 152055
		System.out.println(amount.replace("$",""));  // 15,20,55
		System.out.println(amount.replace("$","").replace(",","")); //152055

		
		//ex-3
		s="abc,123@xyz";
		String arr1[]=s.split(",");    //abc, 123@xyz
		System.out.println(Arrays.toString(arr1));  //[abc, 123@xyz]
		
		
		String arr2[]=arr1[1].split("@");   // 123 xyz
		System.out.println(Arrays.toString(arr2)); //[123, xyz]
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
	
		
		
		String Name ="John Kenedy";
		System.out.println(Name.replace('J','j'));
		System.out.println(Name);
	
		
		
		
		
		
	}

}
