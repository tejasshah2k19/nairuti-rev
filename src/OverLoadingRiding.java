
public class OverLoadingRiding {

	public static void main(String[] args) {
		Banta b = new Banta();
		b.add();
		b.add(12);
		b.accessAdd();
	}
}

//final class can not inherited 
class Santa {
//if we mark final in below method than child can not override method
	void add() {
		System.out.println("add()");
	}

	void add(int a) {
		System.out.println("add(int)");
	}
}

class Banta extends Santa {
	// overriding
	void add() {
		System.out.println("Banta::add()");
	}

	void accessAdd() {
//		add();//Banta
		this.add();// Banta
		super.add(); // super keyword is used to access property of parent class
	}
}
