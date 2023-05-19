package com.example.MyApp.dao;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employe {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private double salary;
	private String dept;
	@CreationTimestamp
	private LocalDateTime creation_time;
	
	@UpdateTimestamp
	private LocalDateTime update_time;
	

}
