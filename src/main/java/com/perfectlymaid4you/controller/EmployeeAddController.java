package com.perfectlymaid4you.controller;

import com.perfectlymaid4you.database.EmployeeDao;
import com.perfectlymaid4you.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/employee", consumes = "*", method = RequestMethod.GET)
public class EmployeeAddController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getEmployeeAddPage(@ModelAttribute("employee") Employee employee, BindingResult result){
        employee.setDateOfTerm(null);
        System.out.println("Employee: "+employee);
        return "/employeeadd";
    }
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") Employee employeeForm){
        System.out.println("Form Info: "+employeeForm);
        try {
            employeeDao.addEmployee(
                employeeForm.getFirstName(),
                employeeForm.getLastName(),
                employeeForm.getAddress(),
                employeeForm.getPhone(),
                employeeForm.getHourlyRate(),
                employeeForm.getEmail(),
                employeeForm.getDob(),
                employeeForm.getSsn(),
                employeeForm.getPosition(),
                employeeForm.getDateOfHire(),
                employeeForm.getShirtSize(),
                employeeForm.getEmergencyContact()
        );
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
        return "employeeaddsuccess";
    }
}
