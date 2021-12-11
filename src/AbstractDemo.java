
public class AbstractDemo {
	public static void main(String[] args) {

	}
}

abstract class RBI {
	protected abstract void wid();// no defination - no body - only declaration

	abstract void dep();

	final void roi() {
		System.out.println("ROI");
	}
}

//ICICI must have to override all the abstract methods 
class ICICI extends RBI {
	public void wid() {

	}

	void dep() {

	}
}
