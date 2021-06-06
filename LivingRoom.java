package Objects;

public class LivingRoom extends Room implements Observer {

	Boolean voice = false;
	
	LivingRoom(Subject tcp) {
		super("living room");
		this.mso = new Objects [2];
		this.chars = new Character[2];
		this.chars[0] = null;
		this.chars[1] = null;
		this.mso[0] = new Newspaper();
		this.mso[1] = new TV();
		tcp.registerObserver(this);
	}

	
	
	@Override
	void description() throws InterruptedException {
		System.out.println("Max: A nice looking chandelier in the ceiling which seems to broken and hanging off. There's a newspaper on the floor and what seems to be a very old TV. Lets hope the TV works!");
	}


	void voiceActivatedLight() throws InterruptedException
	{
		while(!voice)
		{
			Thread.sleep(100);
		}
		System.out.println("You turned on the light");
	}

	@Override
	public void update(Message m) {
		if(m.payload.equals("voice"))
		{
			voice = true;
		}
	}

}
