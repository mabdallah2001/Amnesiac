package Objects;

public class Alive implements State
{
	public void prev(Context c)
	{
		System.out.println("No previous state");
	}
	
	public void next(Context c)
	{	
		c.setStatus(new Dead());
	}
	
	public void printstate()
	{
		System.out.println("The Character is Alive.");
	}
}
