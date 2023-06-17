package com.eidiko.niranjana.Controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.model.Employees;
import com.eidiko.niranjana.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/empData/{id}")
	public List<Employees> retrieveEmployeeData(@PathVariable Integer id )
	{
		List<Employees> listed = null;
		listed = service.fetchEmployeeDetails(id);
		return listed;
	}
	@PostMapping("/update")
	public String employeeDataUpdate(@RequestBody Employees emp) throws ParseException
	{
		String str = null;
//		String StringDate = emp.getHire_date();
//		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");
//		Date date2=formatter2.parse(StringDate);
//		System.out.println(StringDate+"\t"+date2);
		System.out.println("asas");
		str = service.updateEmployeeData(emp.getEmployee_id(),emp.getFirst_name(),emp.getLast_name(),emp.getEmail(),emp.getPhone_number(),emp.getHire_date(),emp.getJob_id(),emp.getSalary(),emp.getCommission_pct(),
				emp.getManager_id(),emp.getDepartment_id());
		System.out.println("cmmm");
		return "Employee data updated";
	}
}
