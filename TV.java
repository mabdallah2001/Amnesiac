package Objects;

public class TV extends MainStoryObjects {

	TV() {
		this.description = "Max notices its a live recording of him staring back at the TV screen";
		this.name = "TV";
	}

	public void triggerEvent() throws InterruptedException {
		System.out.println("            \\  /\r\n" + 
				"              \\/\r\n" + 
				"    .===============.\r\n" + 
				"    | .-----------. |\r\n" + 
				"    | |           | |\r\n" + 
				"    | |           | |\r\n" + 
				"    | |           | |   __\r\n" + 
				"    | '-----------'o|  |o.|\r\n" + 
				"    |===============|  |::|\r\n" + 
				"    |###############|  |::|\r\n" + 
				"    '==============='  '--'\r\n" + 
				"");
		System.out.println("Max: I should try turning on that tv");
	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			this.triggerEvent();Thread.sleep(2000);
			this.itemContext.setStatus(new Discovered());
		} else
			System.out.println("You have already used the " + this.name);
	}
	public void on() {
		System.out.println("Max turned on the TV");
		System.out.println("            \\  /\r\n" + 
				"              \\/\r\n" + 
				"    .===============.\r\n" + 
				"    | .-----------. |\r\n" + 
				"    | |   Hello   | |\r\n" + 
				"    | |    Max    | |\r\n" + 
				"    | |           | |   __\r\n" + 
				"    | '-----------'o|  |o.|\r\n" + 
				"    |===============|  |::|\r\n" + 
				"    |###############|  |::|\r\n" + 
				"    '==============='  '--'\r\n" + 
				"");
		System.out.println(this.toString());
	}
	public void off() {
		System.out.println("Max turned off the TV");
		System.out.println("            \\  /\r\n" + 
				"              \\/\r\n" + 
				"    .===============.\r\n" + 
				"    | .-----------. |\r\n" + 
				"    | |           | |\r\n" + 
				"    | |           | |\r\n" + 
				"    | |           | |   __\r\n" + 
				"    | '-----------'o|  |o.|\r\n" + 
				"    |===============|  |::|\r\n" + 
				"    |###############|  |::|\r\n" + 
				"    '==============='  '--'\r\n" + 
				"");
	}

}
