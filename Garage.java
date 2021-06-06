package Objects;

import java.util.Scanner;

public class Garage extends Room {

	private static Garage instance;

	Character c;
	Ferrari ferrari;
	Hummer hummer;

	Garage(Werewolf w) {
		super("garage");
		this.chars = new Character[2];
		this.chars[0] = null;
		this.chars[1] = w;
		this.mso = new Objects[3];
		this.mso[0] = new Hammer(w);
		this.mso[1] = new Ferrari();
		this.mso[2] = new Hummer();
		this.ferrari = null;
		this.hummer = null;
	}

	public static synchronized Garage getInstance(Werewolf w)
	{
		if (instance == null)
			instance = new Garage(w);
		return instance;
	}


	@Override
	void description() throws InterruptedException {
		System.out.println("Max: Nice! Two cars parked here! I can finally escape this house!");Thread.sleep(2000);
		System.out.println("Max: Ugh.. these don't work, how am I supposed to get out of here then?!"); Thread.sleep(2000);
		this.mechanic();
		System.out.println("Max: So I'm a mechanic.. It's all coming back to me now..\n"
				+ "I can possibly fix one of these cars but which one??\n Should I go for speed or for durability?");
		Scanner sc = new Scanner(System.in);
		String car = sc.nextLine();
		while (true) {
			if(car.equals("speed"))
			{
				this.mso[1].usage(); Thread.sleep(2000);
				ferrari = (Ferrari) this.mso[1];
				ferrari.fix();
				break;
			}
			else if(car.equals("durability"))
			{
				this.mso[2].usage(); Thread.sleep(2000);
				hummer = (Hummer) this.mso[2];
				hummer.fix();
				break;
			}
			else
			{
				System.out.println("This car doesn't exist!");
			}
		}
		System.out.println("Max: Lets start this bad boy up!");
		Thread.sleep(2000);
		System.out.println("I don't have the key! I need a key to start! Guess I have to go and find the key now..");
		System.out.println("There seems to be a hammer on the workbench. Let's go pick it up");
	}

	void mechanic() throws InterruptedException
	{
		System.out.println("**FLASHBACK**");
		Thread.sleep(3000);
		System.out.println("Max hears loud banging sounds, he looks around and finds himself in a car workshop");
		Thread.sleep(3000);
		System.out.println("He sees someone under a car working on it. The person rolls out from under the car and Max comes to face with himself");
		Thread.sleep(3000);
		System.out.println("**END OF FLASHBACK**");
	}

}
