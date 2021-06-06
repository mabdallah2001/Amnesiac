package Objects;

public class Newspaper extends MainStoryObjects {

	Newspaper() {
		this.description = "A worn out newspaper sitting on the table. He picks up the newspaper and starts reading..\n 'women and girl went missing. Husband suspected of murder.'\n Max: OMG, thats the woman that appeared in my memory!";
		this.name = "newspaper";
	}

	public void triggerEvent() throws InterruptedException {

		Thread.sleep(2000);

		System.out.println(""+
				"	  __________\r\n" + 
				"         |DAILY NEWS|\r\n" + 
				"         |&&& ======|\r\n" + 
				"         |=== ======|\r\n" + 
				"         |=== == %%$|\r\n" + 
				"         |[_] ======|\r\n" + 
				"         |=== ===!##|\r\n" + 
				"         |__________|");
		Thread.sleep(2000);

	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			this.triggerEvent();
			System.out.println(this.toString());
			this.itemContext.setStatus(new Discovered());
			
		} else
			System.out.println("You have already used the " + this.name);

	}

}
