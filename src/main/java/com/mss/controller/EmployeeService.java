package com.mss.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

	@Autowired
	EmployeeCrud empCrud;
	
	public List<MssEmployee> getAllEmp() {
	
		return 	empCrud.findAll();
	}

	public Optional<MssEmployee> getEmp(int eno) throws Exception{
		Optional<MssEmployee> emp=empCrud.findById(eno);
		if(emp==null)
			throw new Exception("employee not found");
		else
		return emp;
	}

	public String deleteEmp(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	public String insertEmp(MssEmployee emp) {
		empCrud.save(emp);
		return "employee inserted successfully";
	}

	public String updateEmp(MssEmployee emp, int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
