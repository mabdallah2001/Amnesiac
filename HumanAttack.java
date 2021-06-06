package Objects;

public abstract class HumanAttack  {
	String weapon;
	Creatures monster;
	HumanAttack()
	{
		monster = null;
	}
	
	public abstract void attack(Character c);
}