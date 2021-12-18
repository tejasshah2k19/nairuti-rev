
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		PrintNumbers pn = new PrintNumbers();
		PrintAlphabets pa = new PrintAlphabets();

		pn.start();

		// pn.join();

		Thread t1 = new Thread(pa);
		t1.start();

	}
}

//thread--> 

class PrintNumbers extends Thread {
	public void run() {

		for (int i = 1; i <= 15; i++) {
			System.out.println("i => " + i);
		}
	}
}

class PrintAlphabets implements Runnable {
	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 1; i <= 15; i++) {
			System.out.println("j => " + i);
		}

	}
}
