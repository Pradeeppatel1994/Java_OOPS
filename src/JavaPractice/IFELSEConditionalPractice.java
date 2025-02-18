package JavaPractice;

public class IFELSEConditionalPractice {

	public static void main(String[] args) {
		
		
		//IF-Else Condition
		//WAP for the greatest number between two number
		
		/*int a=100,b=150;
		
		if(a>b) {
			System.out.println("a is greater: "+a);
		}
		else {
			System.out.println("b is greater: "+b);
		}
		*/
		
		//2. WAP for Eligible Voter
		
		/*int person_age =20;
		
		if(person_age>18) {
			System.out.println("Eligible for the Vote");
		}
		
		else {
			System.out.println("Not Eligible for the Vote");
		}
		*/
		
		//3.IF Else for the driving Licence
		
		/* int age =20;
		 
		 if(age>18) {
			 System.out.println("Eligible for the driving Licence.");
		 }
		
		 else if(age==18) {
			 System.out.println("Congrats! Just Became Eligible for the driving lincence.");
		 }
		 else {
			 System.out.println("Not Eligible for the driving Licence.");
		 }
		*/
		
		//4.WAP Even Odd
		
		/*int num=9;
		
		if(num%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		*/
		
		//5. Check Number is Positive,Negative and Zero
		
		/*int num=10;
		
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else if(num==0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Number is Negative");
		}
		*/
		
		
		
		//6.Largest of Three Number
		
		/*int a=10000,b=1200,c=300;
		
		if(a>b & a>c) {
			System.out.println("a is greater");
		}
		
		else if(b>c) {
			System.out.println("b is greater");
		}
		
		else {
			System.out.println("c is greater");
		}
		*/
		
		//7.largest number using ternary operators
		/*int a=10,b=30;
		String result = (a>b)?"a is greater":"b is greater";
		System.out.println(result);*/
		
		//display days names based on days number
		
		/*int day_num=8;
		
		if(day_num==1) {
			System.out.println("Monday");
		}
		else if(day_num==2) {
			System.out.println("Tuesday");
		}
		else if(day_num==3) {
			System.out.println("Wednesday");
		}
		else if(day_num==4) {
			System.out.println("Thursday");
		}
		else if(day_num==5) {
			System.out.println("Friday");
		}
		else if(day_num==6) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Please Enter Valid Day Number");
		}*/
		
		
		
		
		//Switch Statement 
		
		int day_no=8;
		
		switch(day_no) {
		
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Enter Valid Day Number");
}	
		
		//Print day number based on the day name	
		
		String day_name="Friday";
		switch( day_name) {
		case "Monday":System.out.println(1);
		break;
		case "Tuesday":System.out.println(2);
		break;
		case "Wednesday":System.out.println(3);
		break;
		case "Thursday":System.out.println(4);
		break;
		case "Friday":System.out.println(5);
		break;
		case "Saturday":System.out.println(6);
		break;
		case "Sunday":System.out.println(7);
		break;
		default:System.out.println("Enter valida day name");
		
		}
		
		

	}

}
