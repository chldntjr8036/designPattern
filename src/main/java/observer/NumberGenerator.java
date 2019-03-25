package observer;

import java.util.ArrayList;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
