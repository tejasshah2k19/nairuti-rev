
public class InterfaceDemo {

	public static void main(String[] args) {

	}
}

//pure abstract class 
//you can't create instance of interface
interface DOT {

	void add();

	public abstract void sub();
	// by default all the methods are public and abstract in interface

	// final public static
	int x = 90;

}

class Vodafone implements DOT {
	public void add() {
		System.out.println(DOT.x);
	}

	public void sub() {

	}
}
