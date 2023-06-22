package it.uc.devops.restapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.uc.devops.restapi.repository.EmployeeRepository;

@SpringBootTest
public class EmployeeTests {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void succeedTest() {
        assertTrue(true, "True assertions; test succeeds");
    }
    
    @Test
    void repositoryTest() {
        assertNotNull(repository, "repository is not null; test succeeds");
        var emps = repository.findAll();
        boolean result = (emps.size() > 10);
        assertTrue(result, "employees are less than 10!!");
    }

    @Test
    void failTest() {
        fail("this test failed", null);
    }
}
