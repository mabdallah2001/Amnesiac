package Objects;

import java.util.Scanner;


public class Max extends Humans implements Runnable, Observer{

	private static Max instance;

	Objects[] inventory;
	Object equipedobj;
	HumanAttack hatt;
	Watch watch;
	Mirror mirror;
	Room[] room;
	Room roomOfMax;
	Room lastVisited;
	Car car;
	TV tv = new TV();
	TVOn tvon = new TVOn(tv);
	TVOff tvoff = new TVOff(tv);
	Light light = new Light();
	LightOn lon = new LightOn(light);
	LightOff loff = new LightOff(light);
	Command[] cmds = { lon, loff, tvon, tvoff };
	ControlPannel p = new ControlPannel(cmds);
	boolean voicec = false;

	Key key;
	String command;
	Scanner sc;

	Max(Watch w , Bedroom bed, Kitchen kitchen, DiningRoom dining, Basement base, Bathroom bath, Garage g, LaurasBedroom laura, LivingRoom living, Key k) {
		super("Max", 35);
		locname = "";

		// Max's turn for attack.
		turnContext = new Context();
		this.turnContext.setStatus(new MyTurn());
		// Max's current state (Life).
		lifeContext = new Context();
		lifeContext.setStatus(new Alive());
		// Max's current combat status.
		this.inCombatContext = new Context();
		inCombatContext.setStatus(new OutCombat());
		// current object equipped by max.
		equipedobj = null;

		// observer to watch
		watch = w;
		watch.registerObserver(this);
		// user input
		sc = new Scanner(System.in);
		// Human attack
		

		// Rooms
		room = new Room[8];
		room[0] = bed;
		room[1] = kitchen;
		room[2] = dining;
		room[3] = base;
		room[4] = bath;
		room[5] = g;
		room[6] = laura;
		room[7] = living;
		this.key = k;


		Thread t = new Thread(this);
		t.start();
	}

	public static synchronized Max getInstance(Watch w , Bedroom bed, Kitchen kitchen, DiningRoom dining, Basement base, Bathroom bath, Garage g, LaurasBedroom laura, LivingRoom living, Key k)
	{
		if (instance == null)
			instance = new Max(w ,bed, kitchen, dining, base, bath, g, laura, living, k);
		return instance;
	}

	public Boolean checkRooms()
	{
		if ((room[1].roomContext.state instanceof Explored) && 
				(room[2].roomContext.state instanceof Explored)&& 
				(room[3].roomContext.state instanceof Explored)&& 
				(room[4].roomContext.state instanceof Explored)&& 
				(room[5].roomContext.state instanceof Explored)&& 
				(room[6].roomContext.state instanceof Explored)&&
				(room[7].roomContext.state instanceof Explored))
		{
			return false;
		}
		return true;
	}



	public void run() 
	{
		try
		{
			System.out.println("It's a dark night..");
			Thread.sleep(2000);
			System.out.println("Max wakes up from a deep sleep to whispers coming from next to him");
			Thread.sleep(3000);
			System.out.println("He finds himself laying down on a hard surface inside an "
					+ "ancient-looking, dark, quiet room, with an aching head");
			Thread.sleep(3000);
			System.out.println("He sits up slowly and looks around him, unable to recognize the "
					+ "room he’s in or how he got there");
			command = sc.nextLine();
			while (!command.equals("look around")) 
			{
			System.out.println("You might want to look around, as there might be something "
					+ "lurking in the shadows");
			command = sc.nextLine();
			}
			room[0].description();
			Bedroom tmpbed = (Bedroom) room[0];
			tmpbed.interact();
			 
			this.locname = "hallway";
			Thread.sleep(2000);System.out.println("*There are 7 rooms in this house. "
					+ "Unlock all of them and reveal your inner soul*\nBut quickly! "
					+ "You have only 15 minutes!\nTick Tock..");

			while (checkRooms()) 
			{
				command = sc.nextLine();
				String[] parse = command.split(" ");

				if (parse[0].equals("walk") && parse[1].equals("to")) 
				{
					while(true) {
						for (int i = 0 ; i < room.length; i++)
						{
							if (command.contains(room[i].roomName))
							{
								roomOfMax = room[i];
								if (roomOfMax.roomContext.state instanceof NotExplored)
									lastVisited = roomOfMax;
								break;
							}
						}
						if (roomOfMax != null) {
							System.out.println("You have entered the " + roomOfMax.roomName);
							roomOfMax.chars[0] = this;
							roomOfMax.roomContext.nextState();
							this.locname = roomOfMax.roomName;
							light(); // function for command design pattern.
							break;
						}
						else {
							System.out.println("This room does not exist, perhaps you are lost");
						}
						command = sc.nextLine();
						parse = command.split(" ");
					}

				}
				else
				{
					System.out.println("Invalid command!");
				}


				while (!command.equals("exit")) 
				{
					command = sc.nextLine();
					if (command.equals("look around"))
					{
						roomOfMax.description();
					}
					else if(command.contains("turn off light"))
					{
						p.buttonWasPressed(1);
					}
					else if (command.contains("exit"))
					{
						System.out.println("You exitted the " + this.roomOfMax.roomName);
						roomOfMax.chars[0] = null;

					}
					else
					{
						for (int i = 0 ; i < roomOfMax.mso.length; i++)
						{
							if (command.contains(roomOfMax.mso[i].name))
							{

								roomOfMax.mso[i].usage();
								if(this.roomOfMax.mso[i].name.equals("TV")) // command pattern
								{

									command = sc.nextLine();
									while(!command.equals("exit")) 
									{

										if (command.contains("turn on tv")) {
											p.buttonWasPressed(2);
											System.out.println("Max: I better turn that off now..");
										}
										else if (command.contains("turn off tv")) 
										{
											p.buttonWasPressed(3); break;
										}
										else System.out.println("Invalid command");

										command = sc.nextLine();
									}

								}
								if(this.roomOfMax.chars[1] != null){
									if (this.roomOfMax.chars[1].inCombatContext.state instanceof InCombat)
										this.inCombatContext.nextState();
									if (this.roomOfMax.mso[i] instanceof AttackObjects)
										this.equipedobj = this.roomOfMax.mso[i];
									break;
								}
							}
							
						}
					}


					if (this.inCombatContext.state instanceof InCombat)
					{
						System.out.println("COMBAT INSTANCE!!!");
						if (equipedobj instanceof Knife)
						{
							Knife tmpknife = (Knife) equipedobj;
							hatt = tmpknife.knifeatt;
						}
						else if (equipedobj instanceof Sword)
						{
							Sword tmpsword = (Sword) equipedobj;
							hatt = tmpsword.swordatt;
						}
						else if (equipedobj instanceof Hammer)
						{
							Hammer tmphammer = (Hammer) equipedobj;
							hatt = tmphammer.hammeratt;
						}
						Creatures monster = (Creatures) roomOfMax.chars[1];
						monster.catt.monster = monster;
						System.out.println("Current Health: " + this.health);
						System.out.println("Monster's Health: " + monster.health);
						while(this.lifeContext.state instanceof Alive && roomOfMax.chars[1].lifeContext.state instanceof Alive)
						{
							command = sc.nextLine();
							if (command.contains("attack"))
							{
								if (this.turnContext.state instanceof MyTurn)
								{
									this.hatt.attack(monster);
									System.out.println( monster.type+" health: "+ monster.health);
								}

								if (monster.health <= 0)
								{
									monster.health = 0;
									monster.lifeContext.nextState();
									System.out.println("Victory! Max has prevailed over " + monster.type);
									this.health = 100;
									this.inCombatContext.previousState();
									break;
								}

							}
							else if (command.contains("potion"))
							{
								this.health += 15;
							}
							else
							{
								System.out.println("Attack the creature!");
							}
							this.turnContext.previousState();
							monster.catt.attack(this);
							System.out.println("Current Health: " + this.health);
							this.turnContext.nextState();

							if (this.health <= 0)  
							{
								this.lifeContext.nextState();
								this.lifeContext.printStatus();	

							}			
						}
					}
				}
				if (this.lifeContext.state instanceof Dead)
					break;	
			}

			roomOfMax = null;

			System.out.println("You need a key to exit this house. Go to the last room "
					+ " you have visited.");

			while(true)
			{
				command = sc.nextLine();
				String[] parse = command.split(" ");

				if (parse[0].equals("walk") && parse[1].equals("to")) 
				{
					for (int i = 0 ; i < room.length; i++)
					{
						if (command.contains(room[i].roomName))
						{
							roomOfMax = room[i];
							if (roomOfMax == lastVisited)
							{
								Key key = new Key();
								key.usage();
							}
							else if (roomOfMax instanceof Garage)
							{
								System.out.println("Max enters the car. He starts the engine.");Thread.sleep(2000);
								System.out.println("All the creatures come back to life and start chasing after Max"); Thread.sleep(2000);
								System.out.println("He floors the throttle, bashing out the garage door and sees a women and girl bloody and realizes they're the people from his memory.");Thread.sleep(2000);
								System.out.println("Max: LAURA! JESSICA! INSIDE NOW!");Thread.sleep(2000);
								System.out.println("Jessica: AHH! Max??? Whats wrong with your face!?");Thread.sleep(2000);
								System.out.println("**FLASHBACK**\nAfter a tiring day of fixing cars, he heads home and upon parking his car, a zombie rushes to him\nMax: AHHHHHHHH!\n**END OF FLASHBACK**");Thread.sleep(3000);
								System.out.println("Max: Im a zombie??"); Thread.sleep(1500);
								System.out.println("Game Over.");
								System.exit(0);
								
							}
						}
					}

				}
			}
		}
		catch(InterruptedException i)
		{
			i.getStackTrace();
		}

	}

	void light() throws InterruptedException
	{
		if (!this.roomOfMax.roomName.equals("bathroom") && !this.roomOfMax.roomName.equals("lauras bedroom") && !this.roomOfMax.roomName.equals("kitchen") && !this.roomOfMax.roomName.equals("dining room"))
		{
			System.out.println("Turn on the light so you can see");

			if(this.roomOfMax.roomName.equals("living room"))
			{
				System.out.println("This room uses voice in order to turn on the lights. Use your voice on the sensor to turn on the light");
				LivingRoom lv = (LivingRoom) roomOfMax;
				lv.voiceActivatedLight(); // Turned on using voice sensors.
			}
			else {

				command = sc.nextLine();
				while(true) {

					if(command.contains("turn on light"))
					{
						p.buttonWasPressed(0);
						break;
					}
					if(command.equals("exit"))
					{
						System.out.println("You have exitted the " + this.roomOfMax.roomName); break;
					}
					else
						System.out.println("Turn on the light so you can see clearer");
					command = sc.nextLine();
				}
			}
		}
	}
	@Override
	public void flashback() throws InterruptedException {
		System.out.println("**FLASHBACK**\nMax: Jessica!!!!!\n Jessica: Max!! Theyre taking me awayy!\nMax: ILL COME GET YOU!\n**END OF FLASHBACK**");

	}

	
	@Override
	public void update(Message m) {
		long time = Long.parseLong(m.payload)%2;

		if(m.payload.equals("15")) {

			System.out.println(m.payload + " have passed. You weren't able to escape in time"); 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Game Over");
			System.exit(0);
		}
		else if(m.payload.equals("10"))
		{
			System.out.println("5 minutes remaining!");
		}
		else if(m.payload.equals("11"))
		{
			try {
				flashback();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (m.payload.equals("14"))
		{
			System.out.println("1 minute remaining! Quickly! Try to Escape!");
		}
		else if (time == 0)
		{
			System.out.println(m.payload  + " minutes have passed");


		}

	}

	@Override
	public void interaction() throws InterruptedException {
		// TODO Auto-generated method stub

	}


}

