
public class ThreadWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		ThreadSum t = new ThreadSum();
		t.start();
		synchronized (t) {

			t.start();
			t.wait();
		}
		
		//await mysum
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println(t.sum);
	}
}

class ThreadSum extends Thread {
	int sum = 0;

	public void run() {
		mySum();
	}

	synchronized void mySum() {
		System.out.println("counting");
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		notify();
	}
}

//syncronized 
