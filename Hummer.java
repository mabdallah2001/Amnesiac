package Objects;

public class Hummer extends Car {

	
	Hummer() {
		this.description = "A hummer hmmm, it looks familiar but not really my style.";
		this.name = "hummer";
	}

	public void triggerEvent() throws InterruptedException {
		System.out.println("		\r\n" + 
				"                                              ____\r\n" + 
				"                             ______...-----'_'____\\.\r\n" + 
				"             _____.....----==---'\\|-----''''        \\\r\n" + 
				"            /--------'''''  ____ |                   \\\r\n" + 
				"           /  __..--- | .-''    \\|\\                   \\-___\r\n" + 
				"          /| |       || |     __ | \\           ____..-'    `---._\r\n" + 
				"         //  |       || |    [__]| |__...----''                  `-.__\r\n" + 
				" _______//|  |       || |______\\\\| \\ == _____         ____..---''''   \\\r\n" + 
				"/_______/ |  `-------'|         `\\  |==.     ``---.--'   .-\\\\\\\\\\\\\\\\\\| )\r\n" + 
				"|         | [-]       |[-]          | //          | [ ] (  )|||||||||_'|\r\n" + 
				"|         \\           |             |// .-------   \\_____`.----''  \\ ()|\r\n" + 
				"|    _____ \\          |         ___ |` /    ____\\_   |   (_) |__..-'   |\r\n" + 
				"\\   /     \\ \\  ____..-| -----'''    | /  .-'      `-_|_               _|\r\n" + 
				"|  /  _--'-\\ \\         \\            | | /    ___     \\ |  ____:J_P:-''/\r\n" + 
				"| |  /---_    `-.______|__...------'/ //  .-'   `\\    \\|_/      __/_-/\r\n" + 
				" \\| / .-. \\   _ `--..__\\___...-----' | |  |  .-.  |   | ____---'/    |\r\n" + 
				"   | /   \\ \\  \\`-_____....-----------'_|  | (   ) |   |     `--'    /\r\n" + 
				"   | | ( )| |  |__\\________/__..-'     \\  \\  `-'  /   |-'\\         /\r\n" + 
				"   \\ \\    / |  |       \\_     _/        \\  `-.__.'   /    `--.__.-'\r\n" + 
				"    \\ `--' /  /          `---'           \\_        _/\r\n" + 
				"     \\____/__/                             `------'");
		
	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			this.triggerEvent();
			System.out.println(this.toString());
			this.itemContext.nextState();
		} 
		else
			System.out.println("You have already fixed the " + this.name + " you need a key!");
	}

	@Override
	public void tighten() {
		System.out.println("Using a socket wrencth from the toolbox to tighten the wheel nuts of the car");
	}
	
	protected boolean tiresflat() {
		return true;
	}



}
