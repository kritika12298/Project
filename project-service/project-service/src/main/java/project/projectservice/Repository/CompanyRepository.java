package project.projectservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.projectservice.Model.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {
}
