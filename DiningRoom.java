package Objects;

import java.util.Scanner;

public class DiningRoom extends Room {

	
	private static DiningRoom instance;
	
	DiningRoom(Demon d) {
		super("dining room");
		this.chars = new Character[2];
		this.chars[0] = null;
		this.chars[1] = d;
		this.mso = new Objects [2];
		this.mso[0] = new BrokenPlate();
		this.mso[1] = new Sword(d);
	}

	public static synchronized DiningRoom getInstance(Demon d)
	{
		if (instance == null)
			instance = new DiningRoom(d);
		return instance;
	}
	
	
	@Override
	void description() throws InterruptedException {
		System.out.println("Max: Ugh, What is this place.. A broken plate and a sword hanging on the wall. Classic Dining Room..");
	}

}
