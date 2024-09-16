package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		HashSet myset = new HashSet();

		// Set myset = new HashSet();

		// HashSet<String> myset = new HashSet<String>();
		
		//adding elements into hashSet
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing HashSet
		System.out.println(myset);  // [null, A, 100, 10.5, welcome, true]
		
		//Size of HashSet
		
		System.out.println("Size of the HashSet:"+myset.size()); // Size of the HashSet:6
		
		
		//removing element
		myset.remove(10.5); 		// 10.5 is a value [not an index]
		System.out.println("After removing:"+myset);  // [null, A, 100, welcome, true]
		
		//Insertion element --> Not possible in Set Collection
		//accessing specific element --> Not possible directly, but there is a workaround
		
		// first need to convert HashSet-->ArrayList then we can access by Index
		
		ArrayList al= new ArrayList(myset);
		System.out.println(al); 				// [null, A, 100, welcome, true]
		System.out.println(al.get(2)); 			// 100
		
		//Read all the elements using for..each loop
		
		/*for(Object x:myset) {
			System.out.println(x);
		}*/
		
		//Read all the elements using Iterator
		
		Iterator<Object> it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Clearing all the elements in hashset
		
		myset.clear();
		System.out.println(myset.isEmpty());  //true
		
		

		
		
		
		
		

	}

}
