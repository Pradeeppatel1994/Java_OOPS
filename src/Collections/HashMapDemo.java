package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		//HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		
		//Adding Pairs
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"Marry");
		hm.put(104,"Scott");
		hm.put(102,"David");
		System.out.println(hm);  // {101=John, 102=David, 103=Marry, 104=Scott}
		
		System.out.println("Size of HashMap: "+hm);
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing pair:"+hm);  // {101=John, 102=David, 104=Scott}

		//access values by the Key
		System.out.println(hm.get(102)); // David

		//get all the key from HashMap
		System.out.println(hm.keySet());    //[101, 102, 104]
		
		//get all the values from HashMap
		System.out.println(hm.values());  // [John, David, Scott]
		
		//access key and values together
		System.out.println(hm.entrySet());  // [101=John, 102=David, 104=Scott]
		
		//Reading data from from hashmap
		
		//using for each loop
		
		/*for(int k:hm.keySet()) {
			System.out.println(k+" "+hm.get(k));
		}*/
		
		
		//Using Iterator
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String>entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());   // 101 John
																			//102 David
																				//104 Scott
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());//true
		
		
		
		
		

	}

}
