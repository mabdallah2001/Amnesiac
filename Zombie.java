package Objects;

import java.util.Random;
import java.util.Scanner;


public class Zombie extends Creatures {

	
	private static Zombie instance;
	
	Zombie() {
		super("Zombie");
		this.attpower = 6;
	}

	
	public static synchronized Zombie getInstance()
	{
		if (instance == null)
			instance = new Zombie();
		return instance;
	}
	
	public void interaction() throws InterruptedException
	{
		System.out.println("Max hears a low growling sounds coming from behind him and tries to listen closely for the sounds. ");
		
		Thread.sleep(2000);
	
		String command;
		Scanner sc = new Scanner(System.in);
		boolean listen = true, look = false, run = false;
		while(true) 
		{
			command = sc.nextLine();
			
		if (command.contains("listen") && listen) {
			System.out.println("Max swivels around in every direction trying to discern the direction"
					+ " of the noise.\nAs he looks around, a rotten smell overwhelms his senses");
			look = true;
			listen = false;
		}
		
		else if (command.contains("look") && look) {
			System.out.println("        	       		(()))\n" + 
					"                             /|x x|\n" + 
					"                            /\\( - )\n" + 
					"                      ___.-._/\\/\n" + 
					"                     /=`_'-'-'/  !!\n" + 
					"                     |-{-_-_-}     !\n" + 
					"                     (-{-_-_-}    !\n" + 
					"                      \\{_-_-_}   !\n" + 
					"                       }-_-_-}\n" + 
					"                       {-_|-_}\n" + 
					"                       {-_|_-}\n" + 
					"                       {_-|-_}\n" + 
					"                       {_-|-_}  GRRR\n" + 
					"                   ____%%@ @%%_______\n" + 
					"");
			System.out.println("Suddenly, Max sees a blur of movement to his left and swivels around.");
			System.out.println("Max realizes the rotten smell is coming from this person in front of "
					+ "him and the grumbling sounds are coming from him too.\nThe man looks ill and ashen. Max screams");	 
			look = false;
			run = true;
		}	
		else if (command.contains("run") && run) {
			
			System.out.println("Max turns around and stumbles away, trying to make it to the door."
					+ " A hand on his shoulder stops him and turns him around");
			this.inCombatContext.nextState();
			break;
		}
		else
			System.out.println("Try again..");
	}
	
	}

}
