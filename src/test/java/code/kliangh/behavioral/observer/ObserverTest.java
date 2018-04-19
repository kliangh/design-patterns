package code.kliangh.behavioral.observer;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ObserverTest {

    private Ecu ecu;

    private Infotainment infotainment;

    private Hud hud;

    @Before
    public void setUp() {
        ecu = new Ecu();
        infotainment = new Infotainment(ecu);


        ecu.register(infotainment);
        infotainment.setSubject(ecu);

    }

    @Test
    public void testInfotainment() {
        infotainment.update();
    }

    @Test
    public void testHud() {
        hud = new Hud(ecu);

        ecu.register(hud);
        ecu.notifyObservers();
    }

    @Test
    public void addAlarmAndNotifyAllObservers() {
        hud = new Hud(ecu);

        ecu.register(hud);
        ecu.addAlarm(Alarm.DOOR_IS_OPENING);
        ecu.notifyObservers();
    }

    @Test
    public void registerAndDregisterObserver() {
        hud = new Hud(ecu);

        ecu.register(hud);
        hud.setSubject(ecu);

        List<Observer> observers = ecu.getObservers();
        assertTrue(observers.size() == 2);

        ecu.deregister(hud);
        observers = ecu.getObservers();
        assertTrue(observers.size() == 1);
        Observer observer = observers.get(0);
        assertTrue(observer instanceof Infotainment);
    }

    @Test(expected = NullPointerException.class)
    public void exceptionForRegisterObserver() {
        ecu.register(null);
    }

    @Test(expected = NullPointerException.class)
    public void excepitonForDeregisterObserver() {
        ecu.deregister(null);
    }
}
