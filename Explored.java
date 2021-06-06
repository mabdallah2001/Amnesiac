package Objects;

public class Explored implements State 
{
	public void prev(Context c)
	{
		c.setStatus(new NotExplored());
	}
	
	public void next(Context c)
	{
		System.out.println("There is no next state for this current state.");
	}
	
	public void printstate()
	{
		System.out.println("This Room has been explored.");
	}
}
