package project.projectservice.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@ToString
@Document(collection = "company")
public class Company
{
    @Id
    private String companyId;
    private String legalName;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date incorporationDate;
    private String displayName;
    private String stateOfIncorporation;
}
