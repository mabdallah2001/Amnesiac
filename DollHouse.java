package Objects;

public class DollHouse extends MainStoryObjects {

	Humans h;
	
	DollHouse(Laura l) {
		this.description = "A vibrantly colored Doll House, and it seems awfully familiar... \nand a nice doll standing beside it with its head torn off";
		this.name = "dollhouse";
		h = l;
	}

	@Override
	public void triggerEvent() throws InterruptedException 
	{
		Thread.sleep(3000);
		h.flashback();
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
