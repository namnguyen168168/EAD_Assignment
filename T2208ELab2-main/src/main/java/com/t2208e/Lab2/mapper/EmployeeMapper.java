package com.t2208e.Lab2.mapper;

import com.t2208e.Lab2.dto.EmployeeDto;
import com.t2208e.Lab2.entity.Employee;
import org.springframework.beans.BeanUtils;

public class EmployeeMapper {
    public static EmployeeDto entityToDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        BeanUtils.copyProperties(employee, dto);
        return dto;
    }

    public static Employee dtoToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        return employee;
    }
}
