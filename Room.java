package Objects;

abstract public class Room {
	String roomName;
	Context roomContext; // State of room explored by max
	Objects[] mso;
	Character[] chars;
	Key k;

	Room(String room) 
	{
		roomContext = new Context();
		this.roomName = room;
		roomContext.setStatus(new NotExplored());
	}

	abstract void description() throws InterruptedException;
}

