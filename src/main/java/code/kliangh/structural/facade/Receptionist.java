package code.kliangh.structural.facade;

/**
 * This is a facade.
 */
public class Receptionist extends Staff {

    private HumanResourceService humanResourceService;

    private MailRoomService mailRoomService;

    Receptionist(String name) {
        this.name = name;
        this.department = Department.ADMINISTRATION;
        this.isEnable = true;

        this.humanResourceService = new HumanResourceServiceImpl();
        this.mailRoomService = new MailRoomServiceImpl();
    }

    public String greet() {
        return "Hello, welcome! How can I help?";
    }

    public void provideAssistance(Visitor visitor) {
        if (visitor.getPurpose().equals(Purpose.DELIVERY)) {
            humanResourceService.findStaff(visitor.getRespondent());
            mailRoomService.sortParcel();
        }
    }
}
