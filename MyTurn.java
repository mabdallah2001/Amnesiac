package Objects;

public class MyTurn implements State
{
	public void prev(Context c)
	{
		c.setStatus(new NotMyTurn());
	}
	
	public void next(Context c)
	{
		System.out.println("There is no next state for this current state.");
	}
	
	public void printstate()
	{
		System.out.println("This Character is ready to attack.");
	}
}
