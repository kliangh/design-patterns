package code.kliangh.structural.facade;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;

import static code.kliangh.structural.facade.Developer.Skill;

public class HumanResourceServiceImpl implements HumanResourceService {
    private List<Staff> staff;

    public HumanResourceServiceImpl() {
        Staff foo = new Developer("Foo", ImmutableList.of(Skill.CLI));
        Staff bar = new Developer("Bar", ImmutableList.of(Skill.JAVA));

        this.staff = ImmutableList.of(foo, bar);
    }

    @Override
    public void arrangeInterview(Visitor interviewee, Staff departmentManager) {
        System.out.println("Invite interviewee to meeting room.");
        System.out.println("Invite department manager");
        System.out.println("Start interview.");
    }

    @Override
    public Optional<Staff> findStaff(Staff target) {
        return staff.stream()
                .filter(staff -> staff.getDepartment().equals(target.getDepartment())
                        && StringUtils.equals(target.getName(), staff.getName()))
                .findFirst();
    }
}
