package Objects;

public class Locked implements State
{
	public void prev(Context c)
	{
		System.out.println("There is no previous state for this current state.");
	}
	
	public void next(Context c)
	{
		c.setStatus(new NotExplored());	
	}
	
	public void printstate()
	{
		System.out.println("This Room is Locked.");
	}
}
