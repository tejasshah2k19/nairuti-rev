package collectiond;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSetDemo {

	public static void main(String[] args) {
		// unordered unsorted no duplicate
		HashSet<Integer> hs = new HashSet<>();

		hs.add(10);
		hs.add(100);
		hs.add(102);
		hs.add(-10);
		hs.add(10);
		hs.add(103);

		System.out.println(hs);

		// no duplicate , sorted
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(10);
		ts.add(100);
		ts.add(102);
		ts.add(-10);
		ts.add(10);
		ts.add(103);

		System.out.println(ts);

		System.out.println(ts.headSet(102));//102[exclude]
		System.out.println(ts.tailSet(102));//102
	}
}
