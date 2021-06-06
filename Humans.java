package Objects;

public abstract class Humans extends Character {
	String name;
	int age;

	Humans(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public abstract void flashback() throws InterruptedException;
}
