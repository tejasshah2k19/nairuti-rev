
public class DefaultValue {

	public static void main(String[] args) {
//		Kia k = new Kia();
//		k.printData();
//		System.out.println("---------------");
//		Kia k2 = new Kia('x', true);
//		k2.printData();

		
		Kia  k = new Kia();
		k.printData();
	}
}

class Kia {

	byte b;// 0
	short s;// 0
	char c;// null char
	int i;// 0
	long l;// 0
	float f;// 0.0
	double d;// 0.0
	boolean bl;// false

	Kia() {
		this('x',true);//parameterized
		System.out.println("default");
		f = 90000;
		i = 90000;
	}

	Kia(char a, boolean aa) {
		this(11,true);
		System.out.println("para with char");
		c = a;
		bl = aa;
	}

	Kia(int a,boolean aa){
		System.out.println("para with int");
		i = a;
		bl = aa;
	}
	
	
	void printData() {
//		int x;
//		System.out.println(x);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
	}

}