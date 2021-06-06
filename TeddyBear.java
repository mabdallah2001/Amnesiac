package Objects;

public class TeddyBear extends MainStoryObjects {

	TeddyBear() {
		this.description = "A large sized teddy bear with torn arm. Something about it seems familiar...";
		this.name = "teddy bear";
	}

	@Override
	public void triggerEvent() throws InterruptedException {
		// TODO Auto-generated method stub
	}

	@Override
	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			System.out.println(this.toString());
			this.triggerEvent();
			this.itemContext.setStatus(new Discovered());	
			
		} else
			System.out.println("You have already used the " + this.name);
	}

}
