package code.kliangh.structural.facade;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReceptionistTest {

    private Receptionist receptionist;

    @Before
    public void setUp() {
        this.receptionist = new Receptionist("Kenyon", "Hou", Department.ADMINISTRATION);
    }

    @Test
    public void getFirstName() {
        StringUtils.equals("Kenyon", receptionist.getFirstName());
    }

    @Test
    public void setFirstName() {
        receptionist.setFirstName("Foo");
        StringUtils.equals("Foo", receptionist.getFirstName());
    }

    @Test
    public void getSurName() {
        StringUtils.equals("Hou", receptionist.getSurName());
    }

    @Test
    public void setSurName() {
        receptionist.setSurName("Bar");
        StringUtils.equals("Bar", receptionist.getSurName());
    }

    @Test
    public void getDepartment() {
        Department.ADMINISTRATION.equals(receptionist.getDepartment());
    }

    @Test
    public void setDepartment() {
        receptionist.setDepartment(Department.DEVELOPMENT);
        Department.DEVELOPMENT.equals(receptionist.getDepartment());
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
        StringUtils.equals(greeting, receptionist.greet());
    }
}
