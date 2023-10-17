package com.kekcoe.spring.mvc_hibernate_aop.controller;

import com.kekcoe.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.kekcoe.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(){

         List<Employee> employees = employeeDAO.getAllEmployees();

        return "all-employees";
    }

}
