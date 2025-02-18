package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Using  algorithm
		/*int num=54678;
		int resrv=0;
		
		while(num!=0) {
			
			resrv=resrv*10+num%10;
			num=num/10;
		}
		
		System.out.println(resrv);*/
		
		
		//Using Scanner and algorithm
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int resrv=0;
         while(num!=0) {
			
			resrv=resrv*10+num%10;
			num=num/10;
		}
		
		System.out.println(resrv); */
		
		//Using string bufferclas
		
		/*StringBuffer resrv;
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		resrv=sb.reverse();
		System.out.println(resrv);*/
		
		//Using String builer
		
		/*StringBuilder sb =new StringBuilder();
		sb.append(num);
		StringBuilder resv=sb.reverse();
		System.out.println(resv);*/
		
	
	}

}
