package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice1 {

	public static void main(String[] args) {

		// Declarations
		ArrayList mylist = new ArrayList(); // Hertogenoius data

		// List mylist1= new ArrayList(); --> ArrayList class implement krta h List
		// interface ko,that means parent can hold the child.

		// ArrayList<Integer> mylist2= new ArrayList<Integer>(); // to store Homogenous
		// types of date i.e integer

		// 1.Adding data into arraylist -add()

		mylist.add(100);
		mylist.add(12.35);
		mylist.add("Vini");
		mylist.add('P');
		mylist.add(100);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);

		// size of the array
		System.out.println(mylist.size());

		System.out.println("Printing data from arraylist " + mylist); // [100, 12.35, Vini, P, 100, true, null,
																		// null,100]

		System.out.println(mylist.get(5)); // to get specific value from the arraylist using get().

		// Remove elements from arraylist - remove()
		mylist.remove(3);
		System.out.println("Printing data from arraylist,After remove " + mylist);// [100, 12.35, Vini, 100, true, null,
																					// null, 100]

		// Insert the element in arraylist -->add(index,add value)
		mylist.add(3, "Patel");
		mylist.add(9, 2333);
		System.out.println("After Insertion" + mylist); // [100, 12.35, Vini, Patel, 100, true, null, null, 100, 2333]
		System.out.println("After Insertion :" + mylist.size());

		//// modifying element in the arraylist (modify/replace/change) -->
		//// set(index,add value)

		mylist.set(3, "Python");
		System.out.println("after Modifying: " + mylist); // [100, 12.35, Vini, Python, 100, true, null, null, 100,
															// 2333]

		// Read all the data from

		// using normal for loop

		/*
		 * for(int i=0;i<mylist.size();i++) { System.out.println(mylist.get(i)); }
		 */

		// using for each loop
		/*
		 * for( Object ar:mylist) { System.out.println(ar); }
		 */

		// Using Iterator

		/*
		 * Iterator it = mylist.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		/*ArrayList<Integer> ar2 = new ArrayList<Integer>();

		ar2.add(100);
		ar2.add(20);
		ar2.add(30);
		ar2.add(50);

		// check arraylist is empty
		System.out.println(ar2.isEmpty());

		// remove all items from arraylist

		ar2.removeAll(ar2);
		System.out.println("After removing:-> " + ar2.isEmpty());*/
		
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		
		
		
		
		ArrayList<Integer>ar2= new ArrayList<Integer>();
		
		ar2.add(60);
		ar2.add(70);
		ar2.add(80);
		ar2.add(90);
		ar2.add(100);
		
		//add two array using addAll() method
		ar1.addAll(ar2);
		System.out.println("before remove "+ar1);
		System.out.println(ar1.containsAll(ar2));
		
		//remove all
		ar1.removeAll(ar2);
		System.out.println("after remove "+ar1);
		System.out.println(ar2);
		
		System.out.println(ar1.contains(10));  //true
		
		
		

	}

}
