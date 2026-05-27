//Q3
package com.devyani.postassessment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devyani.postassessment.dto.StudentDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class ValidationController {

    @PostMapping
    public ResponseEntity<String> addStudent(
            @Valid @RequestBody StudentDTO dto) {

        return new ResponseEntity<>(
                "Student Created Successfully",
                HttpStatus.CREATED);
    }
}