package it.uc.devops.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.uc.devops.restapi.model.Employee;
import it.uc.devops.restapi.repository.EmployeeRepository;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;
    

    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }
}
