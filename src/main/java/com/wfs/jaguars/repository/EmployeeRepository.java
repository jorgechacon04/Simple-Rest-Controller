package com.wfs.jaguars.repository;

import com.wfs.jaguars.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {

    List<Employee> findByIdIn(List<Long> asList);
}
