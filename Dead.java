package Objects;

public class Dead implements State
{
	public void prev(Context c)
	{
		System.out.println("There is no method to return to Alive State.");
	}
	
	public void next(Context c)
	{
		System.out.println("There is no method to return to Alive State.");
	}
	
	public void printstate()
	{
		System.out.println("You Died.\nGame Over");
		System.exit(0);
	}
}
