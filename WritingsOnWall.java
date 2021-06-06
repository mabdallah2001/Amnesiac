package Objects;

public class WritingsOnWall extends MainStoryObjects {

	Creatures c;
	
	WritingsOnWall(Ghost g) {
		this.description = "You're Next..";
		this.name = "writings";
		c = g;
	}

	public void triggerEvent() throws InterruptedException {
		c.interaction();
	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			Thread.sleep(1000);
			System.out.println(this.toString());
			Thread.sleep(2000);
			this.triggerEvent();
			this.itemContext.setStatus(new Discovered());
		} else
			System.out.println("You have already used the " + this.name);
	}

}
