package Objects;

public class Bathroom extends Room {

	
	private static Bathroom instance;
	
	Bathroom(Ghost g) {
		super("bathroom");
		this.chars = new Character[2];
		this.chars[0] = null;
		this.chars[1] = g;
		this.mso = new Objects [2];
		this.mso[0] = new ToothBrush();
		this.mso[1] = new WritingsOnWall(g);
		//this.character = new Ghost();
	}

	public static synchronized Bathroom getInstance(Ghost g)
	{
		if (instance == null)
			instance = new Bathroom(g);
		return instance;
	}
	
	@Override
	void description() throws InterruptedException {
		System.out.println("Max: Oh great.. whats that smell?");
		Thread.sleep(2000);
		System.out.println("Max: Who left the toilet seat up!?");
		Thread.sleep(2000);
		System.out.println("Max: and oh look, a half bitten toothbrush and there seems to be writing on the wall? with?? blood??");
	}



}
	