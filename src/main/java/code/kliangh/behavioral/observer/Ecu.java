package code.kliangh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ecu implements Subject {
    private List<Observer> observers;

    private Map<String, Status> statuses;

    private String message;

    private Boolean changed;

    public Ecu() {
        this.observers = new ArrayList<>();
    }

    @Override
    public synchronized void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null observer");
        }

        if (observers.contains(observer) == false) {
            observers.add(observer);
        }
    }

    @Override
    public synchronized void deregister(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null observer");
        }

        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public synchronized void notifyObservers() {
        if (changed == false) {
            return;
        }

        List<Observer> observers = new ArrayList<>(this.observers);
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
}
