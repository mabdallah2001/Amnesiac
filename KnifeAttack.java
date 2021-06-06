package Objects;

public class KnifeAttack extends HumanAttack
{
	Knife knife;
	KnifeAttack(Knife k)
	{
		knife = k;
	}

	public void attack(Character c)
	{
		System.out.println("Knife attack!");
		c.health -= knife.damageFromAttack();
	}
}