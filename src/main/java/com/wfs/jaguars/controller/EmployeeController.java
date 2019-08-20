package com.wfs.jaguars.controller;

import com.wfs.jaguars.entity.Employee;
import com.wfs.jaguars.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/v1/employees/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     @GetMapping("/v1/employees")
     public ResponseEntity<List<Employee>> findByIds(@RequestParam(name = "ids") String ids){

        List<Long> idss = Arrays.asList(ids.split(","))
                .stream().map(Long::parseLong).collect(Collectors.toList());

        List<Employee> employees = employeeRepository.findByIdIn(idss);

        if(employees.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(employees);
        }
    }
}


