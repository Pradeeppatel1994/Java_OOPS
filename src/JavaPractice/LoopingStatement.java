package JavaPractice;

public class LoopingStatement {

	public static void main(String[] args) {
		
		/*******************while loop*********************/
		
		//ex-1.Print 1 to 10
		/*int i=1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}*/
		
		//print 10 to 1
		/*int num=10;
		while(num>=1) {
			System.out.println(num);
			num--;
		}*/
		
		//example 3.Print Hello world 10 times
		/*int i=1;
		while(i<=10) {
			System.out.println("Hello World");
			i++;
		}*/
		
		//example 4.Print even and Odd numbers between  1 to 10
		
		/* int num=1;
		
		while(num<=10) {
			if(num%2==0) {
				System.out.println("Number is Even "+num);
			}
			else {
				System.out.println("Number is Odd "+num);
			}
			num++;
		} */
		
		//example 5. Print only even number between 1 to 10
		
		//Approach 1
		/*int num=2;
		while(num<=10) {
			System.out.println(num);
			num+=2;
		}*/
		
		//Approach 2
		
		/*int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println("Number is Even "+i);
			}
			i++;
		}
		*/
		/*****************For Loop****************/
		
		//print 1 to 10
		 
		/*for(int i=1;i<=10;i++) {
			 System.out.println(i);
		 }
		
		//print 10 to 1
		/*for(int i=10;i>=1;i--) {
			System.out.println(i);
		}*/
		
		
		//print only even number between 1 to 10
		
		/*for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}*/
		
		//Print even and odd between 1 to 10
		
		/*for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}
			
			else {
				System.out.println(i+" Odd");
			}

		}
		*/
		
		//print 10 to 1 then -10
		
		/*for(int i=10;i>=-10;i--) {
			System.out.println(i);
		}*/
		//Print -10 to 10
		
		for(int i=-10;i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
