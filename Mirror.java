package Objects;

public class Mirror extends MainStoryObjects {

	Mirror() {
		super();
		this.name = "mirror";
		this.description = "";
	}
	
	public void triggerEvent()
	{
		
	}
	
	
	public void usage() throws InterruptedException{
		
		Thread.sleep(1000);
	

		System.out.println("" + "       //-----------\\\\\n" + "     //       | |   | \\\\\n"
				+ "   //  \\__   /   \\ /  | \\\\\n" + "  ||       \\|     |  / __||\n"
				+ "  ||         \\    | |_/  ||\n" + "  ||\\     __  |   |/ __  ||\n"
				+ "  ||  \\__/   \\|   |_/  \\_||\n" + "  ||  _    ___|  /  \\_   ||\n"
				+ "  ||_/ \\__/   |/_     \\_/||\n" + "  ||          o  \\      _||\n"
				+ "  ||\\       / |    \\___/ ||\n" + "  ||  \\___/   |     \\   /||\n"
				+ "  ||     |   / \\_    )-<_||\n" + "  ||    /  /     \\  /    ||\n" + "   \\\\ /   |      _><    //\n"
				+ "   //\\\\   |     /   \\ //\\\\\n" + "  ||   \\\\-----------//   ||\n"
				+ "  ||                     ||\n" + " /||\\                   /||\\\n"
				+ "/____\\                 /____\\\n");

		
			Thread.sleep(2000);
	
		System.out.println(
				"Upon looking at himself in the broken mirror, he panics, and realizes he has no idea who he is and has no recollection of anything");
		
		this.itemContext.setStatus(new NotDiscovered());
	}

}
