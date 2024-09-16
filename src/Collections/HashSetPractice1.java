package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice1 {

	public static void main(String[] args) {

		// Declarations
		HashSet myset = new HashSet();

		// Set myset1= new HashSet();

		// Adding element in HashSet
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome Java Collections");
		myset.add('S');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);

		// Printitng HashSet
		System.out.println(myset); // [null, S, 100, 10.5, welcome Java Collections, true]

		// size of the HashSet

		System.out.println("Sized of the HashSet: " + myset.size()); // Sized of the HashSet: 6

		// removing element

		myset.remove(10.5);// Here 10.5 is the value, not index

		System.out.println("After removing:-" + myset); // After removing:-[null, S, 100, welcome Java Collections,
														// true]

		System.out.println("After remove size of the HashSet: " + myset.size()); // After remove size of the HashSet: 5
		
		//Inserting element--> not possible in Set collection
		//Accessing/retrieving specific element -->  Not possible directly, but there is a workaround
		
		// first need to convert HashSet-->ArrayList then we can access by Index
		
		/*ArrayList ar = new ArrayList(myset);
		
		System.out.println(ar);  // [null, S, 100, welcome Java Collections, true]
		
		System.out.println(ar.get(1));  // S*/
		
		//Read all the elements using for..each loop
		
		/*for(Object ms:myset) {
			System.out.println(ms);
		}*/
		
		
		//Using Iterator
		
	/*Iterator it=myset.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}*/
		
		
		
	//Clear all the elements in HashSet
		myset.clear();
		System.out.println("After clear HashSet: "+myset);
		System.out.println(myset.size());
		
		

	}

}
