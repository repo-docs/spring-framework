package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void run(){
        Employee employee = new Employee();
        employee.setName("Tammy");
        employee.setDepartment("Aviation");
        employeeRepository.saveAndFlush(employee);
    }
}
