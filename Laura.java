package Objects;

import java.util.ArrayList;

public class Laura extends Humans implements Observer {

	private ArrayList consub;
	
	Laura(ArrayList s) {
		super("Laura", 7);
		// TODO Auto-generated constructor stub
		consub = s;
		for(int i = 0; i < consub.size(); i++)
		{
			Subject subject = (Subject)consub.get(i);
			subject.registerObserver(this);
		}
	}

	@Override
	public void flashback() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("As Max picks up the doll, he's transported to a bright pink room");
		Thread.sleep(3000);
		System.out.println("**FLASHBACK**");
		System.out.println("Max: Happy 7th birthday my princess");
		Thread.sleep(3000);
		System.out.println("Max: I got you this doll! look at her hair. It's just like yours.");
		Thread.sleep(3000);;
		System.out.println("Just as quickly as the memory came to him, it disappeared, leaving him alone with the ghost of what his life might have been");
		Thread.sleep(3000);
		System.out.println("**END OF FLASHBACK**");
		Thread.sleep(3000);
		System.out.println("Max: Laura..");
	}

	public void update(Message m)
	{
		if (m.payload.equals("3"))
			System.out.println("Laura: Daddyy! Save yourself!");
		else if(m.payload.equals("7"))
		{
			System.out.println("Laura: Daddy!!! Escape!");
		}
		else if(m.payload.equals("8"))
		{
			System.out.println("Laura: Find the key!!");
		}
	}
	
	@Override
	public void interaction() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

}
