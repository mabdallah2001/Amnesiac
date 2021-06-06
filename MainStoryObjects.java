package Objects;

public abstract class MainStoryObjects extends Objects {
	
	MainStoryObjects()
	{
		this.itemContext = new Context();
		this.itemContext.setStatus(new NotDiscovered());
	}
	public abstract void triggerEvent() throws InterruptedException; // The flashback caused by the object.
	public abstract void usage() throws InterruptedException;
}
