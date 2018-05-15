package code.kliangh.structural.facade;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor("kliangh", Purpose.DELIEVERY, "Foo");
    }

    @Test
    public void getName() {
        StringUtils.equals("kliangh", visitor.getName());
    }

    @Test
    public void getPurpose() {
        Purpose.DELIEVERY.equals(visitor.getPurpose());
    }

    @Test
    public void getAdditionalInfo() {
        StringUtils.equals("Foo", visitor.getAdditionalInfo());
    }

    @Test
    public void setPurpose() {
        visitor.setPurpose(Purpose.INTERVIEW);
        Purpose.INTERVIEW.equals(visitor.getPurpose());
    }

    @Test
    public void setAdditionalInfo() {
        visitor.setAdditionalInfo("Bar");
        StringUtils.equals("Bar", visitor.getAdditionalInfo());
    }
}