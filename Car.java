package Objects;

import java.util.Scanner;

public abstract class Car extends MainStoryObjects{

	abstract public void triggerEvent() throws InterruptedException;
	
	abstract public void usage() throws InterruptedException;
	
	final public void fix()
	{
		hood();
		tighten();
		radiator();
		battery();
		
		if (tiresflat()) {
			
			pumptire();
		}
		if(faultybreaks()) {
			
			fixbreaks();
		}
	}
	protected void hood() {
		System.out.println("Opening the the hood of the car");
	}
	abstract void tighten();
	
	protected void radiator() {
		System.out.println("Checking the fans of the radiator");
	}
	protected void battery()
	{
		System.out.println("Charging up the batteries");
	}
	protected boolean tiresflat() {
		return false;
	}
	
	protected void pumptire() {
		System.out.println("Pumping car tires to the correct air pressure");
	}
	
	protected boolean faultybreaks() {
		return false;
	}
	protected void fixbreaks() {
		
		System.out.println("Inspecting breaks and fixing them");
	}
	
	
	
	
}
