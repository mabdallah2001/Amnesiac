package Objects;

import java.util.Scanner;

public class Mummy extends Creatures {

	Scanner cmd;
	String buffer;
	
	private static Mummy instance;
	
	Mummy() {
		super("mummy");
		this.attpower = 10;
		cmd = new Scanner(System.in);
		buffer = null;
	}

	
	public static synchronized Mummy getInstance()
	{
		if (instance == null)
			instance = new Mummy();
		return instance;
	}
	
	@Override
	public void interaction() {
		System.out.println("Max: MUMMY!!\nRUN!!!!");
		
	}

}
