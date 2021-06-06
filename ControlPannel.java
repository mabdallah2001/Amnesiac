package Objects;

public class ControlPannel {
	Command [] slots;
	public ControlPannel(Command [] slots) {
		this.slots = slots;
	}
	public void buttonWasPressed(int index){
		slots[index].execute();
	}
}