package JavaProgram;

public class Arrays {

	public static void main(String[] args) {
		
		//Integer
		/*int i[] =new int[4];   //declaration
		 * 
		 * adding values
		i[0]=5;
		i[1]=10;
		i[2]=20;
		i[3]=30;
		
		System.out.println(i[2]);
		System.out.println(i[0]);
		System.out.println(i.length);*/
		
		//double 
		/*double []d= new double[3];
		d[0]=2.22;
		d[1]=33.33;
		d[2]=44.44;
		
		System.out.println(d[2]); */
		
		
	/*	Object [] obj = new Object[3];
		
		obj[0]=22;
		obj[1]="Animal";
		obj[2]='s';
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);*/
		
		// anonymous array --> new int[]{10,20,30};
		int arr[] = {10,20,30,40};
		
		//Print array element using for loop
		
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		
		//Print array element using for loop each
		
		/*for(int a:arr) {
			System.out.println(a);
		}*/
		
		
		//System.out.println(arr.length);
		
		int sum = 0;
	   	/*
		 * for(int i =0;i<arr.length;i++) { sum =sum+arr[i];
		 * 
		 * } System.out.println(sum);
		 */
		
		
		for(int i:arr) {
			sum =sum+i;
		}
		System.out.println(sum);
		

	}

}
