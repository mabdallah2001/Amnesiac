package Objects;

import java.util.ArrayList;
public class Game {
	Game()
	{
		ArrayList a = new ArrayList();
		Watch watch = Watch.getInstance();
		
		TCP_Client tcp = new TCP_Client("192.168.2.33", 56599);
		
		a.add(watch);
		Jessica jessica = new Jessica(a);
		Laura laura = new Laura(a);
		Zombie zombie = Zombie.getInstance();
		Mummy mummy = Mummy.getInstance();
		Demon demon = Demon.getInstance();
		Ghost ghost = Ghost.getInstance();
		Werewolf werewolf = Werewolf.getInstance();
		Key k = new Key();
		
		Bedroom bedroom =  new Bedroom(tcp);
		Kitchen kitchen = Kitchen.getInstance(jessica, zombie);
		DiningRoom dining = DiningRoom.getInstance(demon);
		Basement basement = new Basement(mummy, tcp);
		Bathroom bathroom = Bathroom.getInstance(ghost);
		Garage garage = Garage.getInstance(werewolf);
		LaurasBedroom lb = LaurasBedroom.getInstance(laura);
		LivingRoom living = new LivingRoom(tcp);
		Max max = Max.getInstance(watch, bedroom, kitchen, dining, basement, bathroom, garage, lb, living, k);
		a.add(max);
		
		
		
		
		
	}
}
