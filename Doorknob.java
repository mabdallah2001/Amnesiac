package Objects;

public class Doorknob extends MainStoryObjects implements Observer {
	boolean turn = false;
	Doorknob(Subject tcp) {
		this.description = "";
		this.name = "doorknob";
		tcp.registerObserver(this);
	}

	@Override
	public void usage() throws InterruptedException {
		
		
		System.out.println(
				"Max reaches his arm out and turns the knob.\nSuddenly, he starts hearing whispers start coming from the other side of the door");
		Thread.sleep(2000);
		System.out.println("Max starts shivering");
		Thread.sleep(2000);
		System.out.println("As he places his hand again on the old, rusty doorknob");
		Thread.sleep(2000);
		System.out.println("He opens the door slowly with the the metal door hinge creaking");
		Thread.sleep(3000);
		System.out.println("He hears footsteps coming up the stairs, creeping closer");
		Thread.sleep(3000);
		System.out.println("Max panics and sprints out. The door getting smashed behind him");
		this.itemContext.setStatus(new Discovered());
		Thread.sleep(2000);
	}

	@Override
	public void triggerEvent() throws InterruptedException {
		// TODO Auto-generated method stub

	}


	@Override
	public void update(Message m) {
		if(m.payload.equals("unlock"))
		{
			turn = true;
		}
	}

}


