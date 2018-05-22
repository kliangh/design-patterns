package code.kliangh.structural.facade;

import java.util.List;

public class Developer extends Staff {

    enum Skill{
        JAVA,
        PYTHON,
        CLI
    }

    private List<Skill> skills;

    public Developer(String name, List<Skill> skills) {
        this.name = name;
        this.department = Department.DEVELOPMENT;
        this.skills = skills;
        this.isEnable = true;
    }
}
