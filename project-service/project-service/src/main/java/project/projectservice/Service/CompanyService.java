package project.projectservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.projectservice.Model.Company;
import project.projectservice.Repository.CompanyRepository;

@Service
public class CompanyService
{
    @Autowired
    private CompanyRepository companyRepository;

    //Getting a company's details using its id
    public Company getCompanyById(String id)
    {
        return companyRepository.findById(id).get();
    }

    //Inserting a company's record and returning the id
    public String saveCompany(Company company)
    {
        companyRepository.save(company);
        return "Added company with id: "+company.getCompanyId();
    }
}
