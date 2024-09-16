package Practices;

public class PracticeConcept1 {

	public static void main(String[] args) {

		// integer

		/*
		 * int i =20; i=40; System.out.println(i);
		 * 
		 * int j=50; int k=j; j=80; System.out.println(k); System.out.println(j);
		 */

		// double

		/*
		 * double d1=22.44; double d2=100; double d3=44.44; System.out.println(d1);
		 * System.out.println(d2); System.out.println(d3); d2=77.88;
		 * 
		 * System.out.println(d2);
		 */

		// character

		/*char c = 'A';
		char c1 = 'M';

		System.out.println(c);
		System.out.println(c1);*/
		
		
		//Boolean
		
		/*boolean b1= true;
		boolean b2= false;
		
		System.out.println(b1);
		System.out.println(b2);
		*/
		
		//String
		
		/*String name ="Ramesh Chandra Prakash dubey";
		String name1="Welcome to java";
		System.out.println(name);
		System.out.println(name1);*/
		
		
		//*******************String Concatenation *********************
		
		
		/*int i=100;
		String s1="Hello";
		String s2="World";
		int j=40;
		
		System.out.println(i+j+s1+s2);
		System.out.println((i+j)+s1+s2);
		System.out.println(s1+s2+i+j);
		System.out.println(s1+s2+(i+j));
		System.out.println(i+j+(s1+s2));*/
		
		
		
		//*****************IfElse*************************************
		
		//WAP to check greater number between two number
		
		/*int a=120;
		int b=40;
		
		if(a>b) {
			System.out.println("a is greater:"+a);
		}
		else {
			System.out.println("b is greater:"+b);
		}*/
		
		
		//WAP to find Higher number among three number
		
		/*int a= 100;
		int b=1200;
		int c=500;
		
		if(a>b && a>c) {
			System.out.println("a is greater:"+a);
		}
		else if(b>c) {
			System.out.println("b is greater:"+b);
		}
		else {
			System.out.println("c is greater:"+c);
		}*/
		
		
		//WAP to driving licence 
		
		/*int age =17;
		
		if(age>18) {
			System.out.println("Congrats!you'r eligible for the DL");
		}
		else if(age==18) {
			System.out.println("Ypu just beacme eligible for the DL");
		}
		else {
			System.out.println("Sry! you'r not eligible for the DL");
		}*/
		
		//************Conditional Operator*******************
		
		
		/*int age =18;
		String result=(age>=18)?"Eligible":"Ineligible";
		System.out.println(result);*/
		
		
		//**********************Loops**************************
		
		//while loop
		
		//print number from 1 to 10
		
		/*int num=1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		*/
		
		
		//For Loop
		
		
		// print 0 to 10
		
		/*for(int i=0;i<=10;i++) {
			System.out.println(i);
		}*/
		
		System.out.println("***********************************************");
		
		//print 10 to 1 and -1 to -10
		
		/*for(int i=10;i>=-10;i--) {
			System.out.println(i);
		}*/
		
		//System.out.println("***********************************************");
		
		//Print Hello World -5 times
		
		/*for(int i=1;i<=5;i++) {
			System.out.println("Hello World");
		}*/
		
		//****************************Array Concept**************
		
		
		/*int a[]=new int[4];
		a[0]=4;
		a[1]=5;
		a[2]=6;
		a[3]=10;
		//a[4]=20;
		
		
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[2]);*/
		
		//Object Array
		
		/*Object obj[]=new Object[4];
		obj[0]=23;
		obj[1]='A';
		obj[2]="Animal";
		obj[3]=23.567;
		
		
		System.out.println(obj[0]);
		System.out.println(obj[3]);
		System.out.println(obj[2]);
		System.out.println(obj[1]); */
		
		
		//*************Anonymous array*******************
		
		//anonymous array --> new int[]{10,20,30};
		
		int arr[]= {20,40,50,60};
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);*/
		
		//System.out.println(arr.length);
		
		//Print array element using for loop
		
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		} */
		
		//Print array element using for each loop
		
		/*for(int a:arr) {
			System.out.println(a);
		}*/
		
		
		int sum =0;
		
		/*for(int i=0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		System.out.println(sum);*/
		
		
		for(int a:arr) {
			sum=sum+a;
		}
		System.out.println(sum);
		
		
		//int a[]= new int[-2];   --> it will give the error-->NegativeArraySizeException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
