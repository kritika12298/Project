package project.projectservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import project.projectservice.Model.Employee;
import project.projectservice.Repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    //Inserting an employee's record and returning its id
    public String saveEmployee(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
        return "Added employee with id: "+employee.getEmployeeNumber();
    }

    //Returning the records of 10 employees at a time using pagination
    public List<Employee> employeesPageable(Integer pageSize, Integer pageOffset)
    {
        if (pageSize == null) {
            pageSize = 10;
        }

        if (pageOffset == null) {
            pageOffset = 0;
        }
        return employeeRepository.findAll()
                .stream()
                .skip(pageOffset)
                .limit(pageSize)
                .toList();
    }
}
