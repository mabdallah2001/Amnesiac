package Objects;

public class Discovered implements State
{
	public void prev(Context c)
	{
		c.setStatus(new NotDiscovered());
	}
	
	public void next(Context c)
	{
		System.out.println("There is no next state for this current state.");
	}
	
	public void printstate()
	{
		System.out.println("This Object has been discovered.");
	}
}
