package code.kliangh.structural.facade;

public interface HumanResourceDepartment extends Department{
    void arrangeInterview();

    Staff findStaff(String name);
}
