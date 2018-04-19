package code.kliangh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Ecu implements Subject {
    private List<Observer> observers;

    private List<Alarm> alarms;

    public Ecu() {
        this.observers = new ArrayList<>();
        this.alarms = new ArrayList<>();
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
        List<Observer> observers = new ArrayList<>(this.observers);
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.alarms;
    }

    public void addAlarm(Alarm alarm) {
        this.alarms.add(alarm);
    }

    public List<Observer> getObservers() {
        return this.observers;
    }
}
