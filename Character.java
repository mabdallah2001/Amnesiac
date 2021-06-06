package Objects;

public abstract class Character {
	final int maxHealth = 100;
	int health;
	Context turnContext; // state of turn for fighting.
	Context lifeContext; // state of life of a Character.
	Context inCombatContext; // state of combat of a character.
	String locname;
	Character()
	{
		health = maxHealth;
	}
	
	public abstract void interaction() throws InterruptedException;
}
