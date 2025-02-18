package JavaPractice;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//Single Dimensional Array
		
		//Approach-1
		/*int a[]=new int[4];     // declaration
		
		//adding value
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		*/
		
	//Approach-2
		
		// int a[]= {100,200,300,400};  //anonymous array
		
		//print length of the array
		
		//System.out.println("Length of an array: "+a.length);
		
		//Print specific value from the array
		
		//System.out.println(a[3]);
		
		//************print all the value from the array*******************
		
		//approach -1 using Normal for loop
		
		/*for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		
		//Approach-2 using enhanced for loop
		
		/*for(int x:a) {
			System.out.println(x);
		}*/
		
		
		//Two Dimensional Array
		
		//Approach-1
		/*int a[][]= new int[3][2];
		
		 a[0][0]=100;
		 a[0][1]=200;
		 
		 a[1][0]=300;
		 a[1][1]=400;
		 
		 a[2][0]=500;
		 a[2][1]=600;
		 */
		
		//approach-2
		
		int a[][]= {
					{100,200},
					{300,400},
					{500,600}
					};
		
		//read single specific value from the array
		
		//System.out.println(a[0][1]);
		
		//find the size of an array
		/*System.out.println("Length of row: "+a.length);
		System.out.println("Length of column:"+a[0].length); */
		
		//read all the data from the array using Normal for loop
		
		/*for(int r=0;r<a.length;r++) {
			
			for(int c=0;c<a.length-1;c++) {
				System.out.println(a[r][c]+" ");
			}
			System.out.println();
		}
		*/
		
		
		
		for(int arr[]:a) {
			
			for(int x:arr) {
				System.out.println(x);
			}
			System.out.println();
		}
		

	}

}
