package com.example.MyApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyApp.dao.Employe;
import com.example.MyApp.service.Employeservice;

@RestController
public class EmployeController {
	@Autowired
	Employeservice service;

	@PostMapping("/newEmployee")
	public Employe NewEmploye1(@RequestBody Employe obj) {
		return service.addEmploye(obj);
	}
	@PostMapping("/newEmploye")
	public Employe NewEmploye(@RequestBody Employe obj)
	{
		return service.addEmploye(obj);
	}
	@PostMapping("/newEmployes")
	public List<Employe> NewEmployes(@RequestBody List<Employe> obj)
	{
		return service.addEmployes(obj);
	}
	
	@GetMapping("/allEmploye")
	public List<Employe>allEmploye()
	{
		return service.showEmploye();
	}
	@GetMapping("/GetEmploye/{id}")
	public Employe GetEmploye(@PathVariable int id)
	{
		return service.getEmployeId(id);
	}
	@GetMapping("/GetEmployeName/{name}")
	public Employe GetEmployeName(@PathVariable String name)
	{
		return service.getEmployeByName(name);
	}
	@DeleteMapping("/deleteEmploye/{id}")
	public String GetEmployeId(@PathVariable int id)
	{
		return service.deleteEmploye(id);
	}
	@PutMapping("/editEmp")
	public Employe editEmp(@RequestBody Employe obj)
	{
		return service.editEmploye(obj); 
	}

}
