/**
 * 
 */
package com.ust.EmployeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.EmployeeRegistration.model.Employee;

/**
 * @author Administrator
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
