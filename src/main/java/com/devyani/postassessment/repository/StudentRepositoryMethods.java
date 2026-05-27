// Q10

package com.devyani.postassessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyani.postassessment.entity.Student;

public interface StudentRepositoryMethods
        extends JpaRepository<Student, Long> {

    // find by city
    List<Student> findByCity(String city);

    // find by name and city
    List<Student> findByNameAndCity(
            String name,
            String city);

    // find by email containing keyword
    List<Student> findByEmailContaining(
            String keyword);

    // count students in city
    long countByCity(String city);
}