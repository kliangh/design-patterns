package code.kliangh.structural.facade;

/**
 * This is an entry of facade.
 */
public class Receptionist extends Staff {

    private HumanResourceDepartment humanResourceDepartment;

    public Receptionist(String firstName, String surName, Department department) {
        this.firstName = firstName;
        this.surName = surName;
        this.department = department;
        this.isEnable = true;
    }

    public String greet() {
        return "Hello, welcome! How can I help?";
    }

    public void provideAssistance(Visitor visitor) {
        if (visitor.getPurpose().equals(Purpose.DELIEVERY)) {
            humanResourceDepartment.findStaff(visitor.getAdditionalInfo());
        }
    }
}
