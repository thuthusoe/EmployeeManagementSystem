package employee.domain.service.employee;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import employee.domain.model.Employee;
import employee.domain.repository.employee.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;
    
    @Override
    @Transactional(readOnly = true) 
    public Collection<Employee> findAll() {
        return employeeRepository.findAll();
    }

	@Override
	public Employee create(Employee emp) {

        


        employeeRepository.create(emp);
        /* REMOVE THIS LINE IF YOU USE JPA
            todoRepository.save(todo); // 10
           REMOVE THIS LINE IF YOU USE JPA */

        return emp;
	}

	@Override
	public Employee finish(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String employeeId) {
		// TODO Auto-generated method stub

	}

}
