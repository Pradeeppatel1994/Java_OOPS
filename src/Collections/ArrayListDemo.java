package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		//Declaration
		
		ArrayList mylist= new ArrayList();
		
		//List myli = new ArrayList();
		//ArrayList<Integer> mylist2 = new ArrayList<Integer>();
		
		
		//Adding data into arraylist
		
		mylist.add(100);
		mylist.add(10.25);
		mylist.add('A');
		mylist.add("Pradeep");
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		mylist.add(true);
		
		// Size of ArrayList 
		System.out.println(mylist.size());
		
		//Printing Arraylist
		
		System.out.println("Printing data from the arraylist"+mylist);  // [100, 10.25, A, Pradeep, 100, null, null, true]
		
		//Remove element from arraylist
		
		mylist.remove(4);   // here 4 is index
		System.out.println("After Removing "+mylist);  //  [100, 10.25, A, Pradeep, null, null, true]
		
		//Insert the element in arraylist--> add(index,value)
		
		mylist.add(2, "Java");
		System.out.println("After insertion"+mylist);  // [100, 10.25, Java, A, Pradeep, null, null, true]
		
		//modifying element in the arraylist (modify/replace/change)
		
		mylist.set(2,"python");
		System.out.println("after rfeplacing "+mylist);  // [100, 10.25, python, A, Pradeep, null, null, true]
		
		//access specific element from arraylist
		
		System.out.println(mylist.get(4));   // Pradeep // here 4 is index
		
		//using normal for loop
		//1.Using normal for loop
		
		/*for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}*/
		
		
		// using for each loop (enhance for loop)
		/*for(Object x:mylist) 
		{
			System.out.println(x);
		}*/
	
		
		
		Iterator it=mylist.iterator();	
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Checking arraylist is empty or not -->isEmpty()
		
		System.out.println("is arraylist Empty? "+mylist.isEmpty());  // false
		
		
		//Remove all the elements from arraylist
		
		ArrayList mylist2= new ArrayList();
		mylist2.add(100);
		mylist2.add("Pradeep");
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements "+mylist);
		
		//remove all the Elements/clear
		mylist.clear();
		System.out.println("is arraylist Empty? "+mylist.isEmpty()); // true
		
		
		
		
		
		

	}

}
