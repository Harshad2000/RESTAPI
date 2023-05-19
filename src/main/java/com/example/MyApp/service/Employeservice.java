package com.example.MyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.MyApp.Repo.EmployeRepo;
import com.example.MyApp.dao.Employe;

@Service
public class Employeservice {

	@Autowired
	EmployeRepo repo;

	public Employe addEmploye(Employe obj) {
		return repo.save(obj);
	}
	public List<Employe> addEmployes(List<Employe> obj)
	{
		return repo.saveAll(obj);
	}
	
	public List<Employe> showEmploye()
	{
		return repo.findAll();
		
	}
	
	public Employe getEmployeId(int id)
	{
		return repo.findById(id).orElse (new Employe());
	}
	
	
	public Employe getEmployeByName(String name)
	{
		return repo.findByName(name);
	}
	
	public String deleteEmploye(int id)
	{
		repo.deleteById(id);
		return"Delete sucessfully";
	}
	public Employe editEmploye(Employe obj)
	{
		Employe exobj=repo.findById(obj.getId()).orElse(new Employe());
		exobj.setName(obj.getName());
		exobj.setDept(obj.getDept());
		exobj.setEmail(obj.getEmail());
		exobj.setSalary(obj.getSalary());
		return repo.save(exobj);
	}
	
	
	
	 
	
	 

}
