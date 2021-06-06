package Objects;

import java.util.Random;

public abstract class AttackObjects extends MainStoryObjects
{
	int damageValue;
	
	final int damageFromAttack()
	{
		int minBound = damageValue - 5;
		int maxBound = damageValue + 15;
		
		Random rand = new Random();
		
		return rand.nextInt((maxBound - minBound + 1)) + minBound; 
	}
}
