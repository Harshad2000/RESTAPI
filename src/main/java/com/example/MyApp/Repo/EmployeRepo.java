package com.example.MyApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyApp.dao.Employe;

@Repository
public interface EmployeRepo extends JpaRepository<Employe, Integer> {

	Employe findByName(String name);

	

}
