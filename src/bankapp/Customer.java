package bankapp;

public class Customer extends Bank {

	public static void main(String[] args) {
		Bank b =new	Bank();
		b.wid();
		b.add(); 
		b.mul(); 
		
		Customer c = new Customer();
		c.wid();
		c.add(); 
		c.mul(); 
		 
 
	}
}
