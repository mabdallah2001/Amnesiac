package Objects;

public abstract class Objects {
	String name, description; // Name if needed, Description is first impressions of the object on max.
	Context itemContext; // State of Objects discovered by Max
	public abstract void usage() throws InterruptedException; // The usage of the object if it can be used
	public String toString() {
		return description;
	}
}
