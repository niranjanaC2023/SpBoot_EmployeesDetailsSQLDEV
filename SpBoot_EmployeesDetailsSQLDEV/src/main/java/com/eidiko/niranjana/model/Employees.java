package com.eidiko.niranjana.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {

	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	
	//private String hire_date;
	
	@JsonFormat(pattern = "yyyy-mm-dd",shape = JsonFormat.Shape.STRING)
	private String hire_date;
	private String job_id;
	private Integer salary;
	private Integer commission_pct;
	private Integer manager_id;
	private Integer department_id;
	
}
