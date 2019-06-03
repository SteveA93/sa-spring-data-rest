package com.sarmstrong.spring.learning.payroll;

import com.sarmstrong.spring.learning.payroll.model.Employee;
import com.sarmstrong.spring.learning.payroll.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Steven", "Armstrong", "Java Developer"));
    }
}

