package code.kliangh.structural.facade;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import code.kliangh.structural.facade.Developer.Skill;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    private Developer respondent;

    @Before
    public void setUp() {
        respondent = new Developer("Foo",
                ImmutableList.of(
                        Skill.JAVA,
                        Skill.PYTHON,
                        Skill.CLI));

        visitor = new Visitor("kliangh", Purpose.DELIVERY, respondent);
    }

    @Test
    public void getName() {
        StringUtils.equals("kliangh", visitor.getName());
    }

    @Test
    public void getPurpose() {
        Purpose.DELIVERY.equals(visitor.getPurpose());
    }

    @Test
    public void getRespondent() {
        visitor.getRespondent().equals(respondent);
    }

    @Test
    public void setRespondent() {
        Staff anotherRespondent = new Receptionist("Foo");
        visitor.setRespondent(anotherRespondent);

        assertEquals(anotherRespondent, visitor.getRespondent());
    }

    @Test
    public void setPurpose() {
        visitor.setPurpose(Purpose.INTERVIEW);
        assertEquals(Purpose.INTERVIEW, visitor.getPurpose());
    }

}