package JavaPrograms;

public class GreatestNumber {
	
	
	/*void findGreater(int a,int b) {
		if(a>b) {
			   System.out.println("a is greater number: "+a);
		   }
		   else {
			   System.out.println("b is greater number: "+b);
		   }
	}*/

	public static void main(String[] args) {
		
		// find the greatest number between 2 number
		
		//int a=110,b=20;
		
	   /*if(a>b) {
		   System.out.println("a is greater number: "+a);
	   }
	   else {
		   System.out.println("b is greater number: "+b);
	   }*/
		
		/*int result=(a>b)?a:b;
		System.out.println(result);*/
		
		int a=1100,b=2100,c=300;
		
		if(a>b && a>c) {
			System.out.println("a is greater: "+a);
		}
		else if(b>c) {
			System.out.println("b is greater: "+b);
		}
		else {
			System.out.println("c is greater: "+c);
		}
		

		
	}

}
