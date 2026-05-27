// Q9

package com.devyani.postassessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devyani.postassessment.entity.Employee;

public interface SalaryQueryExample
        extends JpaRepository<Employee, Long> {

    @Query("SELECT MAX(e.salary) " +
           "FROM Employee e " +
           "WHERE e.salary < " +
           "(SELECT MAX(e2.salary) FROM Employee e2)")

    Double findSecondHighestSalary();
}