package code.kliangh.structural.facade;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReceptionistTest {

    private Receptionist receptionist;

    @Before
    public void setUp() {
        this.receptionist = new Receptionist("Kenyon");
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
}
