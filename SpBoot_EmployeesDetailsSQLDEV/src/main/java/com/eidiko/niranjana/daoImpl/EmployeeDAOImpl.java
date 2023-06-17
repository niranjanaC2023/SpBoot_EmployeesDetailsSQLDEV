package com.eidiko.niranjana.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.dao.EmployeeDAO;
import com.eidiko.niranjana.model.Employees;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Employees> fetchEmployeeDetailsById(Integer eid) {
		String FETCH_QUERY = "select employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id from Employees where employee_id=?";
		List<Employees> list = null;
		Object[] args = {eid};
		list = template.query(FETCH_QUERY,args,BeanPropertyRowMapper.newInstance(Employees.class));
		return list;
	}

	

	@Override
	public String updateEmployeeData(Integer employee_id, String first_name, String last_name, String email,String phone_number,
			String hire_date, String job_id, Integer salary, Integer commission_pct, Integer manager_id,
			Integer department_id) {
		System.out.println("rtrts");
		try {
		String UPDATE_QUERY = "update Employees set first_name=?,last_name=?,email=?,phone_number=?,hire_date=?,job_id=?,salary=?,commission_pct=?,manager_id=?,department_id=? where employee_id=?";
		int count=0;
		System.out.println("mamjsn");
		count = template.update(UPDATE_QUERY, first_name,last_name,email,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id,employee_id);
		System.out.println("uuuu");
		return "Employee data updated successfully:";
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	
}
