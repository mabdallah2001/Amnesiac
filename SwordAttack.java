package Objects;

public class SwordAttack extends HumanAttack
{
	Sword sword;
	SwordAttack(Sword s) 
	{
		sword = s;
	}

	public void attack(Character c)
	{
		System.out.println("Sword attack!");
		c.health -= sword.damageFromAttack();
	}
}