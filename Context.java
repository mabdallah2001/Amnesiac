package Objects;

public class Context 
{
	public State state;
	
	public void previousState()
	{
		state.prev(this);
	}
	
	public void nextState()
	{
		state.next(this);
	}
	
	public void printStatus()
	{
		state.printstate();
	}
	
	public void setStatus(State s)
	{
		state = s;
	}
}
