package Objects;

import java.util.ArrayList;

class Jessica extends Humans implements Observer {

	private ArrayList consub;
	
	Jessica(ArrayList s) {
		super("Jessica", 33);
		consub = s;
		for(int i = 0; i < consub.size(); i++)
		{
			Subject subject = (Subject)consub.get(i);
			subject.registerObserver(this);
		}
		
	}

	@Override
	public void flashback() throws InterruptedException {
		System.out.println("**FLASHBACK**");
		Thread.sleep(1500);
		System.out.println("The scene abruptly chnages in front of Max, the kitchen transformring into a habitable one.");
		Thread.sleep(3000);
		System.out.println("He looks around and sees two people sitting at the kitchen counter.He sees what looks like himself and a beautiful woman sipping on a cup of coffee");
		Thread.sleep(3000);
		System.out.println("Max: I'm so glad we get some time to ourselves before the little one comes along");
		Thread.sleep(3000);
		System.out.println("Woman: Oh darling I know, it seems like just yesterday we got married and now all of this is happening at once");
		Thread.sleep(3000);
		System.out.println("Max: Just think, in a year's time everything is going to chnage but it will be okay since we're going to be together");
		Thread.sleep(3000);
		System.out.println("Max tries to reach out to his former self, but as quickly as the memory comes, it fades away and he's left standing in a dim kitchen with flickering lights");
		Thread.sleep(3000);
		System.out.println("**END OF FLASHBACK**");
	}
	
	public void update(Message m)
	{
		if(m.payload.equals("1"))
		{	
			System.out.println("Woman: Max hurry!");
		}
		else if (m.payload.equals("7"))
		{
			System.out.println("Woman: Max c'mon you can do this!!");
		}
	}
	
	@Override
	public void interaction() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

}
