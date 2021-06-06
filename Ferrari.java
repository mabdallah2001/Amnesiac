package Objects;

public class Ferrari extends Car {
	

	Ferrari()
	{
		this.description = "A Ferrari! Is that mine?? Now thats what I'm talking about.";
		this.name = "ferrari";
	}

	@Override
	public void triggerEvent() throws InterruptedException {
		System.out.println(" 		  _.-=\"_-         _\n" + 
				"                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..\n" + 
				"             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'\n" + 
				"      __.--\"\"     __        ,'                   o \\           __        [__|\n" + 
				" __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:\n" + 
				"]       [w] : /        \\ : |========================|    : /        \\ :  [w] :\n" + 
				"V___________:|          |: |========================|    :|          |:   _-\"\n" + 
				" V__________: \\        / :_|=======================/_____: \\        / :__-\"\n" + 
				" -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
		
	}

	@Override
	public void usage() throws InterruptedException {
		
		if (this.itemContext.state instanceof NotDiscovered) {
			this.triggerEvent();
			Thread.sleep(2000);
			System.out.println(this.toString());
			this.itemContext.nextState();
		} else
			System.out.println("You have already fixed the " + this.name + " you need a key!");
	}

	@Override
	public void tighten() 
	{
		System.out.println("Using a screwdriver from the toolbox to tighten the screws on the engine");
	}

	protected boolean faultybreaks() {
		return true;
	}
}
