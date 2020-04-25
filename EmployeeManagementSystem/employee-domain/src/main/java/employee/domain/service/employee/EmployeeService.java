package employee.domain.service.employee;

import java.util.Collection;


import employee.domain.model.Employee;

public interface EmployeeService {

    Collection<Employee> findAll();

    Employee create(Employee emp);

    Employee finish(String employeeId);

    void delete(String employeeId);
}
