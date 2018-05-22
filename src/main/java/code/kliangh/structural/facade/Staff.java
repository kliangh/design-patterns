package code.kliangh.structural.facade;

public abstract class Staff {
    String name;

    Department department;

    Boolean isEnable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Boolean isEnable() {
        return isEnable;
    }

    public void disable() {
        this.isEnable = false;
    }
}
