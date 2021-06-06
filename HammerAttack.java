package Objects;

public class HammerAttack extends HumanAttack
{
	Hammer hammer;
	HammerAttack(Hammer h)
	{
		hammer = h;
	}
	
	
	@Override
	public void attack(Character c) 
	{
		System.out.println("Hammer attack!");
		c.health -= hammer.damageFromAttack();
	}

}
