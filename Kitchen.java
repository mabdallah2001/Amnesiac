package Objects;

public class Kitchen extends Room {

	
	private static Kitchen instance;
	
	Kitchen(Jessica j, Zombie z) {
		super("kitchen");
		this.chars = new Character[2];
		this.chars[0] = null;
		this.chars[1] = z;
		this.mso = new Objects [2];
		this.mso[0] = new CupOfCoffee(j);
		this.mso[1] = new Knife(z);
	
	}
	
	public static synchronized Kitchen getInstance(Jessica j, Zombie z)
	{
		if (instance == null)
			instance = new Kitchen(j, z);
		return instance;
	}
	
	public void description() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("Max: There looks to be an old, rusty can of beans with "
				+ "splatters of blood of blood on it, placed next to what it "
				+ "seems to be a chopped off finger and a bloody knife");

	}

}
