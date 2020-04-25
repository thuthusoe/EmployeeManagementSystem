package employee.domain.repository.employee;

import java.util.Collection;

import employee.domain.model.Employee;


public interface EmployeeRepository {
    Employee findOne(String employeeId);

    Collection<Employee> findAll();

    void create(Employee todo);

    boolean update(Employee todo);

    void delete(Employee todo);
}
