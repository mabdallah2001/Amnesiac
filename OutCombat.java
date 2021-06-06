package Objects;

public class OutCombat implements State
{
	public void prev(Context c)
	{
		System.out.println("There is no previous state for this current state.");
	}
	
	public void next(Context c)
	{	
		c.setStatus(new InCombat());
	}
	
	public void printstate()
	{
		System.out.println("The Character is outside of combat.");
	}
}
