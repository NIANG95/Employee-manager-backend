package org.msn.employeemanager.repository;

import org.msn.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);

}
