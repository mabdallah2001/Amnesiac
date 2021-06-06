package Objects;

public class NotExplored implements State
{
	public void prev(Context c)
	{
		System.out.println("There is no method to return to previous state for this current state.");
	}
	
	public void next(Context c)
	{
		c.setStatus(new Explored());	
	}
	
	public void printstate()
	{
		System.out.println("This Room is not explored yet.");
	}
}
