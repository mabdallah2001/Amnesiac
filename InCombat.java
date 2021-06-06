package Objects;

public class InCombat implements State
{
	public void prev(Context c)
	{
		c.setStatus(new OutCombat());
	}
	
	public void next(Context c)
	{	
		System.out.println("There is no next state for this current state.");
	}
	
	public void printstate()
	{
		System.out.println("The Character is in combat.");
	}
}
