package collectiond;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(15);//array 
		
		list.add("royal");
		list.add(12);
		list.add(3);
		list.add(12.23);
	
		System.out.println(list.get(0));
		
		//list.remove(0); 
		//list.remove("royal");
		
		int k = 90;//
	
		Vector<Integer> mylist= new Vector<>();//10 
		int a[] = new int[10];
		mylist.add(12);//new Integer(12);
		mylist.add(122);
		mylist.add(120);
		mylist.add(12000);
		mylist.add(12);
		
		System.out.println(mylist);

		System.out.println(mylist.size());
		mylist.remove(new Integer(122)); //index or data item 

		
		System.out.println(mylist);
		System.out.println(mylist.size());
		System.out.println("---------for-------------");
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		

		System.out.println("---------forEach-------------");
		for (Integer i:mylist) {
			System.out.println(i);
		}
		
		
	
	}
}
