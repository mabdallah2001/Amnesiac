package Objects;

public class CupOfCoffee extends MainStoryObjects {

	Humans h;
	
	CupOfCoffee(Jessica j) {
		this.name = "cup of coffee";
		this.description = "	_..,----,.._\n" + 
				"      .-;'-.,____,.-';\n" + 
				"     (( |            |\n" + 
				"      `))            ;\n" + 
				"       ` \\          /\n" + 
				"      .-' `,.____.,' '-.\n" + 
				"     (     '------'     )\n" + 
				"      `-=..________..--'\n";
		h = j;
	}

	@Override
	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered)
		{
			System.out.println(toString());
			this.triggerEvent();
			this.itemContext.setStatus(new Discovered());
		}
		else
		{
			System.out.println("Cup of coffee has been discovered");
		}
	}
	
	public void triggerEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Max: .. is that a.. chopped off toe inside??");
		Thread.sleep(2000);
		System.out.println("Max: Why am I feeling dizzy..");
		Thread.sleep(2000);
		System.out.print("Max: I'm so..");
		Thread.sleep(2000);
		System.out.println("so..");
		Thread.sleep(2000);
		h.flashback();
	}
	
	
}
