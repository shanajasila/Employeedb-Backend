package com.example.Employee.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to home page";
    }

    @GetMapping("/add")
    public String addemp(){
        return "Add employee";
    }

    @GetMapping("/search")
    public String search(){
        return "Search employee page";
    }

    @GetMapping("/view")
    public  String view(){
        return "Welcome to view page";
    }


    @GetMapping("/edit")
    public String edit(){
        return "Welcome to edit employee";
    }
}
