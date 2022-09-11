package project.projectservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.projectservice.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
