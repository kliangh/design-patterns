package code.kliangh.structural.facade;

/**
 * This is an entry of facade.
 */
public class Receptionist extends Staff {

    private HumanResourceService humanResourceService;

    private MailRoom mailRoom;

    public Receptionist(String name) {
        this.name = name;
        this.department = Department.ADMINISTRATION;
        this.isEnable = true;
    }

    public String greet() {
        return "Hello, welcome! How can I help?";
    }

    public void provideAssistance(Visitor visitor) {
        if (visitor.getPurpose().equals(Purpose.DELIVERY)) {
            humanResourceService.findStaff(visitor.getRespondent());

        }
    }
}
