package code.kliangh.behavioral.observer;

import java.util.List;

public class Hud implements Observer {
    private Subject ecu;

    private Integer currentVelocity;

    public Hud(Subject ecu) {
        this.ecu = ecu;
        this.currentVelocity = 0;
    }

    @Override
    public void update() {
        List<Alarm> alarms = (List<Alarm>) ecu.getUpdate(this);

        if (alarms.size() == 0) {
            System.out.println("Hud: " + currentVelocity + "km/hr");
        } else {
            alarms.forEach(System.out::println);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.ecu = subject;
    }
}
