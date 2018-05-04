import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		RTask t1 = new RTask("My First Thread...");
		RTask t2 = new RTask("My Second Thread...");
		RTask t3 = new RTask("My Third Thread...");
		RTask t4 = new RTask("My Fourth Thread...");
		RTask t5 = new RTask("My Fifth Thread...");
		
		System.out.println("Hello");
		
		ExecutorService tManager = Executors.newFixedThreadPool(5);
		
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.execute(t1);
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.execute(t2);
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.execute(t3);
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.execute(t4);
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.execute(t5);
		System.out.println(Thread.activeCount() + " threads running.\n");
		tManager.shutdown();
		while(Thread.activeCount() > 1) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.activeCount() + " threads running.\n");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Goodbye");
	}
}
