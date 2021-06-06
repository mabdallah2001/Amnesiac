package Objects;
import java.util.Scanner;

public class Bedroom extends Room {

	
	
	Bedroom(Subject tcp) {
		super("Bedroom");
		this.chars = new Character[1];
		this.chars = null;
		mso = new Objects[2];
		mso[0] = new Mirror();
		mso[1] = new Doorknob(tcp);
		
	}

	
	
	public void description() throws InterruptedException
	{
		System.out.println("Max looks around the room and finds no one there with him");
		Thread.sleep(2000);
		System.out.println("He sways as he stands up, and starts exploring the room he's in");
		Thread.sleep(2000);
		System.out.println("He comes across a broken mirror, surrounded with spider cobs");
	}
	public void interact() throws InterruptedException
	{
		boolean isDiscovered = false;
		if (!isDiscovered) {
			String command;
			Scanner sc = new Scanner(System.in);
			command = sc.nextLine();
			while (!(command.contains("mirror"))) {
				System.out.println("You have to go look at the mirror");
				command = sc.nextLine();
			}
			this.mso[0].usage();
			
			
			System.out.println("" + "            __________\n" + "           |  __  __  |\n" + "           | |  ||  | |\n"
					+ "           | |  ||  | |\n" + "           | |__||__| |\n" + "           |  __  __()|\n"
					+ "           | |  ||  | |\n" + "           | |  ||  | |\n" + "           | |  ||  | |\n"
					+ "           | |  ||  | |\n" + "           | |__||__| |\n" + "           |__________|\n");
				System.out.println("Max heads up to the broken wooden-door\nHe Witnesses an old, rusty doorknob\nUse your phone to turn the knob");
				
				while (!((Doorknob) mso[1]).turn)
				{
					Thread.sleep(200);
				}
				
				this.mso[1].usage(); 
					
				
				
				
				isDiscovered = true;
			
		}
			
		}
	
}

