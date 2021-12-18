package collectiond;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMapDemo {

	public static void main(String[] args) {
		//key : value 
		//key --> unique 
		//value --> duplicate 
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "one");
		hm.put(-2, "two");
		hm.put(1, "three");
		hm.put(11, "oneone");
		hm.put(12, "onetwo");
		
		System.out.println(hm);
		
		System.out.println(hm.get(11));
		System.out.println(hm.get(111));
		
		System.out.println( hm.keySet());
		
		hm.remove(11);
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(1, "one");
		tm.put(-2, "two");
		tm.put(1, "three");
		tm.put(11, "oneone");
		tm.put(12, "onetwo");
		
		System.out.println(tm);
		
	}
}
