package code.kliangh.structural.facade;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReceptionistTest {

    private Receptionist receptionist;

    private Visitor courier;

    private Developer developer;

    private Visitor interviewee;

    @Before
    public void setUp() {
        this.receptionist = new Receptionist("Kenyon");
        this.developer = new Developer("Foo", ImmutableList.of());
        this.courier = new Visitor("Bar", Purpose.DELIVERY, developer);
        this.interviewee = new Visitor("Zoo", Purpose.INTERVIEW, developer);
    }

    @Test
    public void getName() {
        assertEquals("Kenyon", receptionist.getName());
    }

    @Test
    public void setName() {
        receptionist.setName("Bar");
        assertEquals("Bar", receptionist.getName());
    }

    @Test
    public void getDepartment() {
        assertEquals(Department.ADMINISTRATION, receptionist.getDepartment());
    }

    @Test
    public void setDepartment() {
        receptionist.setDepartment(Department.DEVELOPMENT);
        assertEquals(Department.DEVELOPMENT, receptionist.getDepartment());
    }

    @Test
    public void isEnable() {
        assertTrue(receptionist.isEnable());
    }

    @Test
    public void disable() {
        receptionist.disable();
        assertFalse(receptionist.isEnable);
    }

    @Test
    public void greet() {
        String greeting = "Hello, welcome! How can I help?";
        assertEquals(greeting, receptionist.greet());
    }

    @Test
    public void provideAssistance() {
        receptionist.provideAssistance(courier);
        receptionist.provideAssistance(interviewee);
    }
}
