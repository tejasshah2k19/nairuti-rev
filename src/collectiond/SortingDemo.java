package collectiond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SortingDemo {

	public static void main(String[] args) {

		Product p1 = new Product(1200, "mouse", 4);
		Product p2 = new Product(200, "usb", 3);
		Product p3 = new Product(12000, "c3pro", 5);
		Product p4 = new Product(100, "adapter", 2);
		Product p5 = new Product(140000, "13promax", 5);

		ArrayList<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		System.out.println("before sorting");
		System.out.println(products);// p1 p2 p3 p4 p5
		System.out.println(p1); // toString() --> package.class@hashcode
		System.out.println(p1.toString());

		Collections.sort(products);
		
		
		System.out.println("after sorting");
		System.out.println(products);

		int a[] = { 1, 2, 34, 5, 66, 7, 88, 9 };

		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println("\nAfter sorted");
		Arrays.sort(a);// sort
		for (int x : a) {
			System.out.print(x + " ");
		}

		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(34);
		alist.add(5);
		alist.add(66);
		alist.add(7);
		System.out.println("");
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);

	}
}

class Product implements Comparable<Product> {

	int price;
	String name;
	int rating;

	public Product(int p, String n, int r) {
		price = p;
		name = n;
		rating = r;
	}

	@Override
	public String toString() {

		return name + ":" + price + ":" + rating;
	}

	@Override
	public int compareTo(Product o) { // X Y Z F G p1.compareTo(p2) // 1 -1 0 
		if (this.price > o.price) {
			return -1;
		} else if (this.price < o.price) {
			return 1;
		} else {
			return 0;
		}
	}
}
