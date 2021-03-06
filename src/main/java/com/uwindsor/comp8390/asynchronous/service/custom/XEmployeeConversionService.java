package com.uwindsor.comp8390.asynchronous.service.custom;

import com.uwindsor.comp8390.asynchronous.dto.EmployeeDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.Map;

/**
 * @author: Gidado Abdulrauf Aremu
 * @created_date: 06/04/20:4:30 AM
 * email:gidado@uwindsor.ca, abdulraufgidado@yahoo.com
 **/
public interface XEmployeeConversionService {


    String create(@RequestBody EmployeeDto employeeDto) throws IOException;

    Map<String, Object> view(@PathVariable final String id);

    Map<String, Object> searchByEmployeeLastName(@PathVariable final String field);

    String update(@RequestBody EmployeeDto employeeDto) throws IOException;

    String delete(@PathVariable final String id);
}
