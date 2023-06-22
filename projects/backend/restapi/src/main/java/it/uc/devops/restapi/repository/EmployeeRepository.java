package it.uc.devops.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.uc.devops.restapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
