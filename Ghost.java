package Objects;

import java.util.Scanner;

// fix description of max's state based on which room he game from before
public class Ghost extends Creatures  {

	private static Ghost instance;
	
	Ghost() {
		super("Ghost");
		this.attpower = 0;
		// TODO Auto-generated constructor stub
	}

	public static synchronized Ghost getInstance()
	{
		if (instance == null)
			instance = new Ghost();
		return instance;
	}

	@Override
	public void interaction() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.out.println("The room gets slightly colder and Max starts shivering. He can see his breath coming out in a fog in front of him");
		Thread.sleep(2000);
		System.out.println("Max can't shake the feeling of being watched.");
	
			
		String command;
		Scanner sc = new Scanner(System.in);
		command = sc.nextLine();
		boolean mirror = false, run = false;
		while(true) {
			
			if (command.contains("turn"))   {
				System.out.println("The mirror infront of him turns frosty and he feels a presense behind him");
				mirror = true;
			}
			else if(command.contains("mirror") && mirror) {
				System.out.println("Max feels a hand on his shoulder and looks at the mirror above the sink.\nHe sees a sillhoutte of a person in the reflection that looks like a person");
				Thread.sleep(2000);
				System.out.println("	.-----.\n" + 
						"   .' \\/   \\/ '.\n" + 
						"  /  .-. .-.  \\\n" + 
						"  |  | | | |  |\n" + 
						"   \\ \\o/ \\o/ /\n" + 
						"  _/    ^    \\_\n" + 
						" | \\  _---_  / |\n" + 
						" / /`--. .--`\\ \\\n" + 
						"/ /'---` `---'\\ \\\n" + 
						"'.__.       .__.'\n" + 
						"    `|     |`\n" + 
						"     |     \\\n" + 
						"     \\      '--.\n" + 
						"      '.        `\\\n" + 
						"        `'---.   |\n" + 
						"           ,__) /\n" + 
						"            `..'\n" + 
						"" + "\n\tBOO!");
				run = true;
			}
			else if (command.contains("run") && run)
			{
				System.out.println("You run away from the ghost.");
				break;
			}
			else
				System.out.println("Try again..");
			
			command = sc.nextLine();
		
			
		
	}

}
}
