import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentExecutionDemo {

	public static void main(String[] args) {

		ThreadD t1 = new ThreadD();
		ThreadD t2 = new ThreadD();
		ThreadD t3 = new ThreadD();

		System.out.println(Runtime.getRuntime().availableProcessors());
//		ExecutorService ex = Executors.newFixedThreadPool(4);//8 =>  3 free  

//		ExecutorService ex = Executors.newCachedThreadPool();// 2=>8=>8 free

//			Executors.newSingleThreadExecutor(); //1 worker 

		ScheduledExecutorService ex = Executors.newScheduledThreadPool(2);

		// 60 second idle
		ex.submit(t1);
		ex.submit(t2);
		ex.submit(t3);
//		ex.scheduleAtFixedRate(t1, 5, 25, TimeUnit.SECONDS);
		ex.scheduleWithFixedDelay(t1, 5, 25, TimeUnit.SECONDS);

		// n number of thread
		// 50-> 1..............50
		// 500 -> pool--> blocking
		// 1thread -> 500 --> non blocking
	}
}

class ThreadD extends Thread {
	public void run() {
		System.out.println("thread.....");
	}
}