package com.eidiko.niranjana.dao;

import java.util.List;

import com.eidiko.niranjana.model.Employees;

public interface EmployeeDAO {
	
	public List<Employees> fetchEmployeeDetailsById(Integer eid);
	
	public String updateEmployeeData(Integer employee_id,String first_name,String last_name,String email,String phone_number,String hire_date,String job_id,Integer salary,Integer commission_pct,Integer manager_id,Integer department_id);

}
