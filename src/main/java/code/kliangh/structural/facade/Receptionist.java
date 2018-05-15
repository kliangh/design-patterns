package code.kliangh.structural.facade;

public class Receptionist extends Staff {

    private HumanResourceDepartment humanResourceDepartment;

    public void greet() {
        System.out.println("Hello, welcome! How can I help?");
    }

    public void provideAssistance(Visitor visitor) {
        if (visitor.getPurpose().equals(Purpose.DELIEVERY)) {
            humanResourceDepartment.findStaff(visitor.getAdditionalInfo());
        }
    }
}
