package Objects;

public class Hammer extends AttackObjects 
{

	Creatures c;
	HammerAttack hammeratt;
	Hammer(Werewolf w) {
		this.description = "A box containing a multitude of tools. A hammer seems to be "
				+ "protruding out of the box.";
		this.name = "hammer";
		this.damageValue = 8;
		hammeratt = new HammerAttack(this);
		c = w;
	}

	public void triggerEvent() throws InterruptedException {

		System.out.println("       ,\r\n" + 
				"      /(  ___________\r\n" + 
				"     |  >:===========`\r\n" + 
				"      )(\r\n" + 
				"      \"\"");
		Thread.sleep(2000);
		c.interaction();
	}

	public void usage() throws InterruptedException {
		if (this.itemContext.state instanceof NotDiscovered) {
			System.out.println(this.toString());
			this.triggerEvent();
			this.itemContext.setStatus(new Discovered());
		} else
			System.out.println("You have already used the " + this.name);

	}

}
