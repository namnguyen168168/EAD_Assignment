package com.t2208e.Lab2.service;

import com.t2208e.Lab2.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> findAllEmployees();
}
