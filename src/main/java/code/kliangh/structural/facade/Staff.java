package code.kliangh.structural.facade;

public abstract class Staff {
    String firstName;

    String surName;

    Department department;

    Boolean isEnable;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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
