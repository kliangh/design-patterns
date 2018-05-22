package code.kliangh.structural.facade;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanResourceServiceImplTest {

    private HumanResourceService humanResourceService;

    @Before
    public void setUp() {
        humanResourceService = new HumanResourceServiceImpl();
    }


    @Test
    public void findStaff() {
        Staff foo = new Developer("Foo", ImmutableList.of(Developer.Skill.CLI));
        Staff target = humanResourceService.findStaff(foo).get();

        assertEquals(target.getDepartment(), foo.getDepartment());
        assertEquals(target.getName(), foo.getName());
    }
}