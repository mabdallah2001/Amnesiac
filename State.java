package Objects;

public interface State {
	public void next(Context c);
	public void prev(Context c);
	public void printstate();
}
