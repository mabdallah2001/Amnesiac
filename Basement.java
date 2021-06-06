package Objects;

public class Basement extends Room implements Observer {

	Boolean running = false;
	Basement(Mummy m, Subject tcp) {
		super("basement");
		this.chars = new Character[2];
		chars[0] = null;
		chars[1] = m;
		tcp.registerObserver(this);
	}
	
	

	@Override
	public void description() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(".."); Thread.sleep(1500);
		chars[1].interaction();

		while (!running)
		{
			Thread.sleep(3000);
		}
		
		System.out.println("You manage to reach the basement door. Exit before the mummy gets to you!");
	}



	@Override
	public void update(Message m) {
		if (m.payload.equals("run"))
		{
			running = true;
		}
		
	}


}
