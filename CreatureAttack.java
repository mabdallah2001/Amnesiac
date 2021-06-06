package Objects;

public class CreatureAttack {
	
	Creatures monster;
	Max max;
	
	CreatureAttack(Max m)
	{
		max = m;
	}

	public void attack(Character c)
	{
	
		
		max = (Max) c;
		
	
		
		max.health -= monster.attpower;
	}

}
