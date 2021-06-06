package Objects;

public class TVOff implements Command {
	
	TV tv;

	TVOff(TV tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.off();
	}
}
