package com.eidiko.niranjana.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.EmployeeDAO;
import com.eidiko.niranjana.model.Employees;
import com.eidiko.niranjana.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;

	@Override
	public List<Employees> fetchEmployeeDetails(Integer empId) {
		List<Employees> empDetails = null;
		empDetails = dao.fetchEmployeeDetailsById(empId);
		return empDetails;
	}

	@Override
	public String updateEmployeeData(Integer employee_id, String first_name, String last_name, String email,
			String phone_number, String hire_date, String job_id, Integer salary, Integer commission_pct,
			Integer manager_id, Integer department_id) {
		System.out.println("amam");
		String data = null;
		data = dao.updateEmployeeData(employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id);
		System.out.println("djdjs");
		return data;
	}

}
