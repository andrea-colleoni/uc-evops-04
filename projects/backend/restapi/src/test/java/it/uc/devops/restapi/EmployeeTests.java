package it.uc.devops.restapi;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    }
}
