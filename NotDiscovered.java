package Objects;

public class NotDiscovered implements State
{
	public void prev(Context c)
	{
		System.out.println("There is no method to return to previous state for this current state.");
	}
	
	public void next(Context c)
	{
		c.setStatus(new Discovered());	
	}
	
	public void printstate()
	{
		System.out.println("This Object is not discovered yet.");
	}
}
