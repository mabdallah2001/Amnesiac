package Objects;

public class Key extends MainStoryObjects
{
	
	Key()
	{
		this.description = "This looks like the key for the exit door.";
		this.name = "key";
	}
	
	
	public void triggerEvent() throws InterruptedException {
		
		System.out.println(""
				+ "            .--.\r\n" + 
				"              /.-. '----------.\r\n" + 
				"              \\'-' .--\"--\"\"-\"-'\r\n" + 
				"               '--'");
	}

	
	public void usage() throws InterruptedException 
	{
		if (this.itemContext.state instanceof NotDiscovered)
		{
			this.triggerEvent();
			
			Thread.sleep(2000);
			System.out.println(this.toString());
			this.itemContext.setStatus(new Discovered());
			System.out.println("Now that you have the key, you can exit the house."
					+ " go to the garage.");
		}
		else
		{
			System.out.println("You used the key on the exit door.");
		}
	}
	
}
