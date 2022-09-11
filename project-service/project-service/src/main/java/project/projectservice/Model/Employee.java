package project.projectservice.Model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@ToString
@Document(collection ="employee")
public class Employee
{
    @Id
    private Integer employeeNumber;
    private String firstName;
    private String lastName;
    private String companyID;
    private String workEmail;
    private String managerID;
    private Date DateOfBirth;
    private Integer taxIDNumber;
    private String employmentStatus;
    private String maritalStatus;
}
