package project.projectservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.projectservice.Model.Company;
import project.projectservice.Service.CompanyService;

@RestController
public class CompanyController
{
    @Autowired
    private CompanyService companyService;

    //Method to get a company's details using its id
    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable String id) {
        return companyService.getCompanyById(id);
    }

    //Method to insert a company's data and returning the id
    @PostMapping("/company")
    public String saveCompany(@RequestBody Company company)
    {
        companyService.saveCompany(company);
        return "Added company with id: " + company.getCompanyId();
    }
}
