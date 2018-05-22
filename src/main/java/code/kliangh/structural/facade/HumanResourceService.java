package code.kliangh.structural.facade;

import java.util.Optional;

/**
 * This is a service.
 */
public interface HumanResourceService {
    void arrangeInterview();

    Optional<Staff> findStaff(Staff target);
}
