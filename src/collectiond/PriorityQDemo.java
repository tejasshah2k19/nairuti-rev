package collectiond;

import java.util.PriorityQueue;

public class PriorityQDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(12);
		pq.add(121);
		pq.add(122);
		pq.add(123);
		pq.add(-12);
		pq.add(1200);
		pq.add(12);
		pq.add(100);
		pq.add(-10);//

		System.out.println(pq);

		System.out.println(pq.peek());//-12 
		System.out.println(pq.peek());//-12
		
		System.out.println(pq.poll());//-12
		System.out.println(pq.poll());//-10
		
		System.out.println(pq.size());
		System.out.println(pq.remove(1200));
		
		
	}
}
