package com.sarmstrong.spring.learning.payroll.repository;

import com.sarmstrong.spring.learning.payroll.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
