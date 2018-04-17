package code.kliangh.behavioral.observer;

public interface Subject {
    //Register and deregister observer
    void register(Observer observer);

    void deregister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);
}
