package Objects;

public class LightOff implements Command {

	Light light;
	LightOff(Light light) {
		this.light = light;
	}
	public void execute() {
		light.off();
	}
}