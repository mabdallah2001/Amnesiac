package Objects;

public class Sword extends AttackObjects {

	Demon demon;
	SwordAttack swordatt;
	
	Sword(Demon d) {
		this.description = "        />_________________________________\r\n" + 
				"[########[]_________________________________>\r\n" + 
				"        \\>\r\n" + 
				"";
				
		this.name = "sword";
		this.damageValue = 10;
		demon = d;
		swordatt = new SwordAttack(this);
	}

	@Override
	public void triggerEvent() throws InterruptedException {
		System.out.println("A diamond sword artifact, made in Japan hung on the wall.. How amusing");
		demon.interaction();
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
