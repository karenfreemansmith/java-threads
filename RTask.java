import java.util.Random;

public class RTask implements Runnable {
	private int sleepTime;
	private String threadName;
	private static Random r = new Random();
	
	public RTask (String t_name) {
		threadName = t_name;
		sleepTime = r.nextInt(5000);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(threadName + " going to sleep for " + sleepTime + " milliseconds.\n");
			Thread.sleep(sleepTime);
		} catch(InterruptedException e) {
			e.printStackTrace();
		} 
			
		System.out.println(threadName + " is done sleeping\n");
		
	}

}
