package Objects;

import java.util.Scanner;

public class Werewolf extends Creatures  {

	private static Werewolf instance;
	
	Werewolf() {
		super("Werewolf");
		this.attpower = 11;
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Werewolf getInstance()
	{
		if (instance == null)
			instance = new Werewolf();
		return instance;
	}
	
	@Override
	public void interaction() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Max hears a whinning sound behind him and looks around the nearly empty garage to determine the source.");
		
			Thread.sleep(2000);
	
		String command;
		Scanner sc = new Scanner(System.in);
		command = sc.nextLine();
		boolean crates = false, fight = false, pet = false;
		while(true) 
		{
			if(command.contains("walk")) {
				System.out.println("He walks around the garage trying to see where the sound is coming from.\n The whinning gets louder the closer he gets to the crates.");
				crates = true;
			}
			else if(command.contains("crates") && crates)  {
				System.out.println("Max crouches down and moves the crates. He is suddenly knocked backwards by a weight on his chest.");
				fight = true;
			}
			else if(command.contains("fight") && fight ) {
				System.out.println("Max starts grappling with the creature trying to push it off but it persists, whinning. He flings it off him and realizes it's a black dog");
				pet = true;
			}
			else if(command.contains("pet") && pet) {
				System.out.println("Max starts petting the dog in front of him. The dog starts grawling harshly. His eyes turn blue and starts to grow and turns into a werewolf! He starts to attack you");
				this.inCombatContext.nextState();
				break;
			}
			else
				System.out.println("Try again..");
			
			command = sc.nextLine();
			
		}
		
	}

}
