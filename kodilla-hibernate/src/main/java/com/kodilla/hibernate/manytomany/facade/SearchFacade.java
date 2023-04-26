package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@EnableAspectJAutoProxy
@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> processSearchCompany(final String charToSearch)
            throws SearchingException {

        List<Company> selectedCharCompanies = companyDao.retrieveNameWith(charToSearch);

        if (selectedCharCompanies == null) {
            throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
        } else {
            selectedCharCompanies.forEach(
                    company -> System.out.println(company));
        }

        return selectedCharCompanies;
    }

    public List<Employee> processSearchEmployee(final String charToSearch)
            throws SearchingException {

        List<Employee> selectedCharEmployees = employeeDao.retrieveNameWith("%" + charToSearch + "%");

        if (selectedCharEmployees == null) {
            throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            selectedCharEmployees.forEach(
                    employee -> System.out.println(employee));
        }

        return selectedCharEmployees;
    }
}