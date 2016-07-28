package com.perfectlymaid4you.controller;

import com.perfectlymaid4you.database.EmployeeDao;
import com.perfectlymaid4you.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/employee", consumes = "*", method = RequestMethod.GET)
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/list")
    public ModelAndView listEmployees() {
        ModelAndView modelAndView = new ModelAndView("employees");
        modelAndView.addObject("list", employeeDao.getEmployeeList());
        return modelAndView;
    }
}
