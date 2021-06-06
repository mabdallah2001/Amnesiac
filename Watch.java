package Objects;

import java.util.ArrayList;

public class Watch extends ConcreteSubject implements Runnable {

	private static Watch instance;
	private ArrayList conobs;
	private long startTime, currentTime;

	private Watch() {
		// time variable for counting the time.
		startTime = System.currentTimeMillis();
		currentTime = 0;
		conobs = new ArrayList();
		// Watch is a thread. Continously counting time.
		Thread t = new Thread(this);
		t.start();
	}

	public static synchronized Watch getInstance() {
		if (instance == null)
			instance = new Watch();
		return instance;
	}
	
	
	public void run() {
		while (true) 
		{
			for (int i = 0; i < 15; i++)
			{
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			this.currentTime ++;
			
			Message m = new Message(this, "time", Long.toString(currentTime));
			publishMessage(m);
			}
			
		}
	}

}
