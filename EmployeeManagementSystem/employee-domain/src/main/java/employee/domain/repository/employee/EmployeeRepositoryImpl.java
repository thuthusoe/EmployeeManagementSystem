package employee.domain.repository.employee;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;


import employee.domain.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	private static final Map<String, Employee> EMPLOYEE_MAP = new ConcurrentHashMap<String, Employee>();

    public Employee findOne(String employeeId) {
        return EMPLOYEE_MAP.get(employeeId);
    }

    @Override
    public Collection<Employee> findAll() {
        return EMPLOYEE_MAP.values();
    }

    @Override
    public void create(Employee emp) {
    	EMPLOYEE_MAP.put(emp.getEmployeeId(), emp);
    }

    @Override
    public boolean update(Employee emp) {
    	EMPLOYEE_MAP.put(emp.getEmployeeId(), emp);
        return true;
    }

    @Override
    public void delete(Employee emp) {
    	EMPLOYEE_MAP.remove(emp.getEmployeeId(), emp);
    }

}
