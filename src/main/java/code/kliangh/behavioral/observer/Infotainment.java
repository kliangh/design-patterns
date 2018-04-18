package code.kliangh.behavioral.observer;

import java.util.List;

public class Infotainment implements Observer {
    private Subject ecu;

    public Infotainment(Subject ecu) {
        this.ecu = ecu;
    }

    @Override
    public void update() {
        List<Alarm> alarms = (List<Alarm>) ecu.getUpdate(this);

        if (alarms == null || alarms.size() == 0) {
            System.out.println("All Good");
        } else {
            alarms.forEach(System.out::println);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.ecu = subject;
    }
}
