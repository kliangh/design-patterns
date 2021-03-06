package code.kliangh.structural.facade;

/**
 * <h1>Visitor</h1>
 * <p>
 *     The receptionist will greet the visitor and provide some kind help.
 * </p>
 *
 * <b>Note:</b> The <i>additionalInfo</i> contains receiver name while the visitor is a courier.
 * As long as the visitor is a interviewee, the <i>additionalInfo</i> would be the department which interviewer belongs to.
 */
public class Visitor {
    private String name;

    private Purpose purpose;

    private Staff respondent;

    public Visitor(String name, Purpose purpose, Staff respondent) {
        this.name = name;
        this.purpose = purpose;
        this.respondent = respondent;
    }

    public String getName() {
        return name;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Staff getRespondent() {
        return respondent;
    }

    public void setRespondent(Staff respondent) {
        this.respondent = respondent;
    }
}
