package com.example.Employee.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to home page";
    }

    @PostMapping("/add")
    public String addemp(){
        return "Add employee";
    }

    @PostMapping("/search")
    public String search(){
        return "Search employee page";
    }

    @GetMapping("/view")
    public  String view(){
        return "Welcome to view page";
    }


    @PostMapping("/edit")
    public String edit(){
        return "Welcome to edit employee";
    }


    @PostMapping("/delete")
    public String delete(){
        return "Delete employee here";
    }
}
