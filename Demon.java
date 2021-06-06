package Objects;

import java.util.Scanner;

public class Demon extends Creatures  {

	private static Demon instance;
	
	Demon() {
		super("Demon");
		this.attpower = 8;
		// TODO Auto-generated constructor stub
	}

	
	public static synchronized Demon getInstance()
	{
		if (instance == null)
			instance = new Demon();
		return instance;
	}
		
	public void interaction() throws InterruptedException {
			// TODO Auto-generated method stub
			System.out.println("The smell of sulfur fills the air making it impossible to breathe "
					+ "and his eyes blurry.");
			
				Thread.sleep(2000);
			
			System.out.println(
					"A shadow passes over him.\nHe tries to look around but there appears "
					+ "to be a black mist in front of him.\n");
			
				Thread.sleep(2000);
	
			String command;
			Scanner sc = new Scanner(System.in);
			command = sc.nextLine();
			boolean reach = false, turn = false;
			while(true) {
				if (command.contains("look"))
				{
					System.out.println("As he looks around with blurry eyes, he senses something around him but can't see anything.");
					reach = true;
			}
				else if (command.contains("reach") && reach) {
					System.out.println("As he reaches out to the cabinets, they abruptly slam shut in his face. He stumbles back and bumps into something solid.");
					turn = true;
		}
				else if(command.contains("turn") && turn)  {
					Thread.sleep(2000);
					System.out.println("\n" + 
							"          (                      )\n" + 
							"          |\\    _,--------._    / |\n" + 
							"          | `.,'            `. /  |\n" + 
							"          `  '              ,-'   '\n" + 
							"           \\/_         _   (     /\n" + 
							"          (,-.`.    ,',-.`. `__,'\n" + 
							"           |/#\\ ),-','#\\`= ,'.` |\n" + 
							"           `._/)  -'.\\_,'   ) ))|\n" + 
							"           /  (_.)\\     .   -'//\n" + 
							"          (  /\\____/\\    ) )`'\\\n" + 
							"           \\ |V----V||  ' ,    \\\n" + 
							"            |`- -- -'   ,'   \\  \\      _____\n" + 
							"     ___    |         .'    \\ \\  `._,-'     `-\n" + 
							"        `.__,`---^---'       \\ ` -'\n" + 
							"           -.______  \\ . /  ______,-\n" + 
							"                   `.     ,'          ");
					Thread.sleep(2000);System.out.println("Max: AHHHHHH!!! WHAT IS THAT");
					this.inCombatContext.nextState();
					break;
	}
				else
					System.out.println("Try again..");
				
				command = sc.nextLine();

				}

			}
		}
