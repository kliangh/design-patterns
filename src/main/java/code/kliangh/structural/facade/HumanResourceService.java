package code.kliangh.structural.facade;

import java.util.Optional;

/**
 * This is a service.
 */
public interface HumanResourceService {
    void arrangeInterview(Visitor interviewee, Staff departmentManager);

    Optional<Staff> findStaff(Staff target);
}
