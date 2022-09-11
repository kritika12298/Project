package project.projectservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.projectservice.Model.Employee;
import project.projectservice.Service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    //Method to return 10 records at a time using pagination
    @GetMapping("/employee")
    public List<Employee> getPaginatedCountries(
            @RequestParam(name="pageSize", required = false) Integer pageSize,
            @RequestParam(name="pageOffset", required = false) Integer pageOffset)
    {

        return employeeService.employeesPageable(pageSize, pageOffset);
    }

    //Method to insert an employee's details and returning its id
    @PostMapping("/employee")
    public String saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployee(employee);
        return "Added employee with id: "+employee.getEmployeeNumber();
    }
}
