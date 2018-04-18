package code.kliangh.behavioral.observer;

import org.junit.Before;
import org.junit.Test;

public class ObserverTest {

    private Ecu ecu;

    private Infotainment infotainment;

    @Before
    public void setUp() {
        ecu = new Ecu();
        infotainment = new Infotainment(ecu);


        ecu.register(infotainment);
        infotainment.setSubject(ecu);

    }

    @Test
    public void testObserver() {
        infotainment.update();
    }

    @Test
    public void testAddingAlarm() {
        ecu.addAlarm(Alarm.DOOR_IS_OPENING);
        ecu.notifyObservers();
    }
}
