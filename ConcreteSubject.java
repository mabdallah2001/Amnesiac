package Objects;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;

	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}

	
	public void publishMessage(Message m) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			// observer.update();
			observer.update(m);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}

	


}