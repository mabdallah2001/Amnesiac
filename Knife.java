package Objects;

public class Knife extends AttackObjects {

	Creatures c;
	KnifeAttack knifeatt;
	Knife(Zombie z) {
		this.description = "A Bloody Knife that looks well maintained, this may serve as a good weapon.";
		this.name = "knife";
		this.damageValue = 5;
		c = z;
		knifeatt = new KnifeAttack(this);
	}

	public void triggerEvent() throws InterruptedException {
		Thread.sleep(1000);

		System.out.println(" ___________________________________ ______________________\r\n"
				+ " \\                                  | (_)     (_)    (_)   \\\r\n"
				+ "  `.                                |  __________________   }\r\n"
				+ "    `-..........................____|_(                  )_/");
		Thread.sleep(1000);
	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			this.triggerEvent();
			System.out.println(this.toString()); 
			Thread.sleep(2000);
			this.itemContext.setStatus(new Discovered());
			c.interaction();
		} else
			System.out.println("You have already used the " + this.name);
	}

}
