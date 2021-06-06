package Objects;

public class TVOn implements Command {

	TV tv;

	TVOn(TV tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.on();
	}
}
