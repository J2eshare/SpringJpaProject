package com.mss.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class EmployeeController {

	@Autowired(required=true)
	private EmployeeService eservice;
	
	@GetMapping("/getAllEmps")
	public List<MssEmployee> getAllEmployee()
	{
		return eservice.getAllEmp();	
	}
	
	@GetMapping("/getEmp/{eno}")
	public Optional<MssEmployee> getEmp(@PathVariable int eno) throws Exception
	{
	return eservice.getEmp(eno);
	}
	
	@GetMapping("/deleteEmp/{eno}")
	public String deleteEmp(@PathVariable int eno)
	{
	return eservice.deleteEmp(eno);
	}
	
	@PostMapping("/insertEmp")
	public String insertEmp(@RequestBody MssEmployee emp ) {
		
		return eservice.insertEmp(emp);
	}
	
	@PutMapping("/updateEmp/{eno}")
	public String updateEmp(@RequestBody MssEmployee emp, @PathVariable int eno  ) {
		
		return eservice.updateEmp(emp,eno);
	}
}
