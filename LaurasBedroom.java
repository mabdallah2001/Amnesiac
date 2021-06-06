package Objects;

public class LaurasBedroom extends Room {

	
	private static LaurasBedroom instance;
	

	
	LaurasBedroom(Laura l) {
		super("lauras bedroom");
		this.chars = new Character[3];
		this.chars[0] = null;
		this.chars[1] = null;
		this.chars[2]= l;
		this.mso = new Objects [2];
		this.mso[0] = new TeddyBear();
		this.mso[1] = new DollHouse(l);
	
	}
	
	
	public static synchronized LaurasBedroom getInstance(Laura l)
	{
		if (instance == null)
			instance = new LaurasBedroom(l);
		return instance;
	}
	
	
	@Override
	public void description() throws InterruptedException {
		System.out.println("Max: This seems to be like a child's room.. The wallpapers are all ripped.\nMax: There seems to be a dollhouse and a teddy bear? Lets see what these objects are about I guess..");
		Thread.sleep(2000);
	}
}
