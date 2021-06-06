package Objects;

public abstract class Creatures extends Character {
	String type;
	int attpower;
	CreatureAttack catt;

	Creatures(String t) 
	{
		this.type = t;
		lifeContext = new Context();
		lifeContext.setStatus(new Alive());
		turnContext = new Context();
		turnContext.setStatus(new NotMyTurn());
		inCombatContext = new Context();
		inCombatContext.setStatus(new OutCombat());
		catt = new CreatureAttack(null);
	}

	public abstract void interaction() throws InterruptedException;
}
