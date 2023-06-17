package com.eidiko.niranjana.service;

import java.util.List;

import com.eidiko.niranjana.model.Employees;

public interface EmployeeService {
	
	public List<Employees> fetchEmployeeDetails(Integer empId);
	
	public String updateEmployeeData(Integer employee_id,String first_name,String last_name,String email,String phone_number,String hire_date,String job_id,Integer salary,Integer commission_pct,Integer manager_id,Integer department_id);

}
