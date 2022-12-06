package com.example.Employee.backend.controller;


import com.example.Employee.backend.dao.EmployeeDao;
import com.example.Employee.backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> viewpage(){
        return(List<Employee>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addemp(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        return "Added successfully";
    }

}
